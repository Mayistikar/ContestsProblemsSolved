import java.util.Scanner;

class PositiveNegatibe{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();

	if(t<0){
	    System.out.print("Negative");
	}else if(t==0){
	    System.out.print("Zero");
	}else if(t>0){
	    System.out.print("Positive");
	}

    }
}
