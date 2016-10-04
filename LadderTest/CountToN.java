import java.util.Scanner;

class CountToN{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	for(int x=1; x<n; x++){

	    System.out.print(x+" ");
	}
	System.out.print(n);
    }
}
