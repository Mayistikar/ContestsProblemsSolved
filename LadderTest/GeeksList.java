import java.util.Scanner;

class GeeksList{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	String name = sc.next();
	String lName = sc.next();
	String inv = sc.next();

	int pos = inv.indexOf(name+lName);
	if(pos>-1){
	    System.out.print("Invited");
	}else{
	    System.out.print("I don't have time for parties, I have thigs to do.");
	}
	    

    }
}
