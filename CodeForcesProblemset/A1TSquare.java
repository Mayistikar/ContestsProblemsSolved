import java.util.Scanner;
import java.math.BigInteger;

public class A1TSquare{
    
    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	String n = sc.next();
	String m = sc.next();
	String a = sc.next();

	BigInteger nx = new BigInteger(n, 10);
	BigInteger mx = new BigInteger(m, 10);
	BigInteger ax = new BigInteger(a, 10);
	BigInteger totnx = new BigInteger("0");
      	BigInteger totmx = new BigInteger("0");
	
	
	if(nx.mod(ax).equals(new BigInteger("0",10))){
	    totnx = nx.divide(ax);
	}else{
	    totnx = (nx.divide(ax)).add(new BigInteger("1", 10));
	}
	if(mx.mod(ax).equals(new BigInteger("0", 10))){
	    totmx = mx.divide(ax);
	}else{
	    totmx = (mx.divide(ax)).add(new BigInteger("1", 10));
	}
    
        System.out.println(totnx.multiply(totmx).toString());
    }

}
