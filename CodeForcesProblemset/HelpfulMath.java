import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMath{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	String[] cadena = sc.next().split("\\+");

	Arrays.sort(cadena);// Arregla la cadena

	for (int x=0; x<cadena.length-1; x++){
	    System.out.print(cadena[x]+"+");
	}
	System.out.println(cadena[cadena.length-1]);
    }
}
