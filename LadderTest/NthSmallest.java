import java.util.Scanner;
import java.util.LinkedList;



class NthSmallest{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();
	int con = 10;
	int valor;
	LinkedList<Integer> lista = new LinkedList<Integer>();
	
	while(t>0){
	    lista.add(1001);
	    lista.add(1001);
	    while(con>0){

		valor = sc.nextInt();
		if(valor<lista.get(0)){
		    lista.add(0,valor);
		}else if(valor<lista.get(1)){
		    lista.add(1,valor);
		}
		con--;		
	    }
	    System.out.println(lista.get(1));
	    lista.clear();
	    con = 10;
	    t--;
	}
    }
 }
