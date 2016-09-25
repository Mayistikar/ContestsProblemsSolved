import java.util.*;

public class ChatRoom{

    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	LinkedList q = new LinkedList();
	q.add("*");

	int contador=0;
	int conh=0;
	int cone=0;
	int conl=2;
	int cono=0;

	String wordS = sc.next();

	for(String x : wordS.split("")){

	    if(x.equals("h")){
		if(conh!=1){
		    q.add(x);
		    conh=1;
		    contador++;
		}
	    }else if(x.equals("e")){
		if(cone!=2&&contador>0){
		    q.add(x);
		    cone=2;
		    contador++;
		}	      
	    }else if(x.equals("l")){
		if(conl!=4&&contador>1){
		    q.add(x);
		    conl++;
		    contador++;
		}
	    }else if(x.equals("o")){
		if(cono!=5&&contador==4){
		    q.add(x);
		    cono=5;
		}
	    }
	}
	q.removeFirst();
	wordS="";
	while(!q.isEmpty()){

	    wordS+=q.removeFirst();
	}
	if(wordS.equals("hello")){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
    }
}
