import java.util.Scanner;

public class KidsCandies{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int cases = sc.nextInt();
	int n, k, candies;
	int cont = 0;

	while (cases>0){

	    n = sc.nextInt();
	    k = sc.nextInt();

	    for(int i=0; i<n; i++){
		candies = sc.nextInt();
		if(candies>k){
		    cont+=(candies/k);
		}		
	    }

	    System.out.println(cont);
	    cont=0;
	    cases--;
	}
    }
}
