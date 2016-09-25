import java.util.Scanner;

public class WTLWords{

    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String palabra;
	String[] cadena;
	while(n>0){
	    palabra = sc.next();
	    if(palabra.length()>10){
		cadena = palabra.split("");
		System.out.println(cadena[0]+(cadena.length-2)+cadena[cadena.length-1]);
	    }else{
		System.out.println(palabra);
	    }
	    n--;
	}
    }
}
