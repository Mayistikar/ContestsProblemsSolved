import java.util.Scanner;
import java.util.Arrays;

class GTX{

    public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int dist = 102;
	int first=0, second=0;

	int[] list = new int[n];
	for(int x=0; x<n; x++){
	    list[x]=sc.nextInt();
	}
	Arrays.sort(list); // Ordena el arreglo de enteros de menor a mayor 

	for(int y=0; y<n-1; y++){
	    if((list[y+1]-list[y])<dist){
		dist = list[y+1]-list[y];
		first = list[y];
		second = list[y+1];
	    } 
	}
	System.out.print(first+" "+second);
    }

}
