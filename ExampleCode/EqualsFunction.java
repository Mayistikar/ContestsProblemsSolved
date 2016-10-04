import java.util.Scanner;

class EqualsFunction{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	String x = sc.next();
	String y = sc.next();

	System.out.println(x.compareTo(y));
	//	System.out.println(y.compareTo(x));
    }
}
