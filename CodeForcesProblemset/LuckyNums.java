import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class LuckyNums{

    public static Node calNodos(Node nodo){

	if(nodo.getDigito()=='*'){
	    nodo.setDigito('4');
	    return nodo;
	}else if(nodo.getDigito()=='4'){
	    nodo.setDigito('7');
	    return nodo;
	}else if(nodo.getDigito()=='7' && nodo.getNextNode()==null){
	    nodo.setDigito('4');
	    nodo.setNextNode(new Node('4'));
	    nodo.getNextNode().setPrevNode(nodo);
	    return nodo;
	}else if(nodo.getDigito()=='7' && nodo.getNextNode().getDigito()=='4'){
	    nodo.setDigito('4');
	    nodo.getNextNode().setDigito('7');
	    return nodo;
	}else if(nodo.getDigito()=='7' && nodo.getNextNode().getDigito()=='7'){
	    nodo.setDigito('4');
	    return calNodos(nodo.getNextNode());
	}
	return nodo;
    }


    public static int numLucky(Node nodo){
	String numerox="";

	while(nodo.getNextNode()!=null){
	    nodo=nodo.getNextNode();
	}

	while(nodo.getPrevNode()!=null){
	    numerox+=nodo.getDigito();
	    nodo=nodo.getPrevNode();
	}
	numerox+=nodo.getDigito();

	return Integer.parseInt(numerox);
    }
    
    
    public static int[] numsLuckies(int digitos){


	int cantLuckies = 0;
	
	for(int x=digitos; x>0; x--){
	    cantLuckies += (int)Math.pow(2, x);
	}

	int[] listaNumeros = new int[cantLuckies];
	
	Node nodoPpal = new Node();
		
	for(int z=0; z<cantLuckies; z++){
	    listaNumeros[z]=numLucky(calNodos(nodoPpal));
	}
	
	return listaNumeros;
    }
    
    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	boolean verificar = false;

	if(n<10){
	    int[] arr = numsLuckies(1);
	    for(int i=0; i<arr.length; i++){
		if(n%arr[i]==0){
		    verificar = true;
		}
	    }
	}else if(n>=10 && n<100){
	    int[] arr = numsLuckies(2);
	    for(int i=0; i<arr.length; i++){
		if(n%arr[i]==0){
		    verificar = true; 
		}
	    }

	}else if(n>=100 && n<=1000){
	    int[] arr = numsLuckies(3);
	    for(int i=0; i<arr.length; i++){
		if(n%arr[i]==0){
		    verificar = true;
		}
	    }
	    
	}

	    if(verificar){
		System.out.println("YES");
	    }else{
		System.out.println("NO");
	    }
    }
}

class Node{

    private char digito;
    private Node nextNode;
    private Node prevNode;

    public Node(char digitox){
	this.digito=digitox;
	this.nextNode=null;
	this.prevNode=null;
    }

    public Node(){
	this.digito='*';
	this.nextNode=null;
	this.prevNode=null;
    }
    //%%%%%%%%%%%% GETTER Y SETTERS %%%%%%%%%%%%%%%%%

    public char getDigito(){
	return digito;
    }

    public Node getNextNode(){
	return nextNode;
    }

    public Node getPrevNode(){
	return prevNode;
    }

    public void setDigito(char digitox){
	this.digito=digitox;
    }

    public void setNextNode(Node nextNodex){
	this.nextNode=nextNodex;
    }

    public void setPrevNode(Node prevNodex){
	this.prevNode=prevNodex;
    }
}
