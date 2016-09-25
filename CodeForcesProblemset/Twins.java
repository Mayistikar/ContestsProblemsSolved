import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Twins{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] monedas = new int[n];
	int sumTotal = 0;
	int provisorio;
	int contador=0;

	while(n>0){
	    provisorio = sc.nextInt();
	    monedas[contador]=provisorio;
	    sumTotal+=provisorio;

	    contador++;
	    
	    n--;
	}

	Arrays.sort(monedas);

	provisorio=0;
	contador=0;
	for(int x=monedas.length-1; x>=0; x--){
	    contador++;
	    provisorio+=monedas[x];
	    if(provisorio>(sumTotal-provisorio)){
		System.out.println(contador);
		break;
	    }

	}

    }
}
