import java.util.Scanner;
import java.util.Arrays;

class substract{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	String s = sc.next();
	char[] c = s.toCharArray();
	int x = Integer.parseInt(""+c[0]);
	int y = Integer.parseInt(""+c[2]);	

	System.out.println(x-y);
    }
}
