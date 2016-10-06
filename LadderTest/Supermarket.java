import java.util.Scanner;

class Supermarket{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int s = sc.nextInt();
	int suma = 0;

	for(int x=0; x<n; x++){
	    suma+=sc.nextInt();
	    if(suma>s){
		System.out.print("No");
		return;
	    }
	}
	System.out.print("Yes");
    }
}
