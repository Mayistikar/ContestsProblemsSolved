import java.util.Scanner;

public class PetyaStrings{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	String cad1 = sc.next().toLowerCase();
	String cad2 = sc.next().toLowerCase();

	if(cad1.compareTo(cad2)<0){
	    System.out.println("-1");
	}else if (cad1.compareTo(cad2)==0){
	    System.out.println("0");
	}else if (cad1.compareTo(cad2)>0){
	    System.out.println("1");
	}
	
    }
}
