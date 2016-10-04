import java.util.Scanner;

class Aki{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	String palabra = sc.next().toLowerCase();
	if(palabra.equals(new StringBuilder(palabra).reverse().toString())){
	    System.out.println("Palindrome");
	}else{
	    System.out.println("Not Palindrome");
	}
    }
}
