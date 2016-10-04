import java.util.Scanner;

class Max{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	int max = sc.nextInt();
	int x2 = sc.nextInt();
	if(max<x2){
	    max=x2;
	}
	int x3 = sc.nextInt();
	if(max<x3){
	    max=x3;
	}
	System.out.print(max);
    }
}
