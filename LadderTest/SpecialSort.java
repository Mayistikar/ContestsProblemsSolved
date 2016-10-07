import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

class SpecialSort{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int x;

	LinkedList par = new LinkedList();
	LinkedList impar = new LinkedList();
	
	while(n>0){

	    x=sc.nextInt();
	    if(x%2==0){
		par.add(x);
	    }else{
		impar.add(x);
	    }	    	    
	    n--;
	}

	Object[] p = new Object[par.size()];
	Object[] i = new Object[impar.size()];

	par.toArray(p);
	impar.toArray(i);

	Arrays.sort(p);
	Arrays.sort(i);
	
	for(int z=0; z<p.length; z++){
	    System.out.println(p[z]);
	}
	for(int y=i.length-1; y>=0; y--){
	    System.out.println(i[y]);
	}
    }

}
