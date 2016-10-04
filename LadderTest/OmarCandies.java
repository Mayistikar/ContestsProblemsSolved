import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;


class OmarCandies{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	String s;
	char[] c;
	int cond;
	LinkedList<String> cl = new LinkedList<String>();
	String xs;
	int contador;
	LinkedList<String>  pareja = new LinkedList<String>();

	while(t>0){
	    pareja.add("}");
	    pareja.add("0");
	    s = sc.next();
	    c = s.toCharArray();
	    
	    for(int x=0; x<c.length; x++){
		cl.add(""+c[x]);
	    }

	    while(!cl.isEmpty()){
		cond = 0;
		contador = 0;
		xs = cl.getFirst();
		while(cond > -1){
		    cond = cl.indexOf(xs);
		    if(cond>-1){
			cl.remove(cond);
			contador++;
		    }
		}

		if(contador>Integer.parseInt( pareja.get(1) ) ){
		    pareja.clear();
		    pareja.add(xs);
		    pareja.add(String.valueOf(contador));
		}else if(contador==Integer.parseInt( pareja.get(1) ) ){
		    if( xs.compareTo(pareja.get(0))<0 ){		  
			pareja.clear();
			pareja.add(xs);
			pareja.add(String.valueOf(contador));
		    }

		}
	    }
	    System.out.println(pareja.get(1)+" "+pareja.get(0));
	    pareja.clear();
	    t--;
	}
    }
}
