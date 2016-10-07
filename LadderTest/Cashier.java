import java.util.Scanner;
import java.util.Arrays;

class Cashier{

    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	int[] list = new int[101];
	int n = 101;
	for(int i=0; i<list.length; i++){ // En jse 8 no es necesario inicializar el arreglo por que al crearlo el array se llena de ceros por defecto
	    list[i]=0;
	}

	while(n!=0){
	    n=sc.nextInt();
	    if(n!=0){
		list[n]=list[n]+1; // En JSE 8 esta expresion se puede remplazar por list[n]++ osea que las posiciones de un arreglo entero son autoincrementables
	    }
	}
	for(int x=0; x<list.length; x++){
	    if(list[x]!=0){
		System.out.println(x+" "+list[x]);
	    }
	}
    }
}
