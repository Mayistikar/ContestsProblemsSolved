import java.util.Scanner;

class Magdy{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int c = sc.nextInt();

	if(c==0){
	    System.out.print("Don't be lazy, it takes only few minutes, you can do it.");
	}else if(c==1){

	    System.out.print("Good Job");
	}else if(c>1){
	    System.out.print("You Rocks Man");
	}
    }

}
