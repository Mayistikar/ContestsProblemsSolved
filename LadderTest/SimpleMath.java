import java.util.Scanner;
//import java.Math;

class SimpleMath{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	System.out.println( Double.parseDouble( Double.toString(( -b + Math.pow( ( (b*b)-(4*a*c) ) , (0.5)  )  )/(2*a) ) ));
    }


}
