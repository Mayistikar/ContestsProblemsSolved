import java.util.Scanner;
import java.math.BigInteger;

class PrimePalBigInt{

    public static boolean palind(String palabra){
	if(palabra.length()==1||palabra.length()==0){
	    return true;
	}else{
	    if(palabra.charAt(0)==palabra.charAt(palabra.length()-1)){
		return palind(palabra.substring(1,palabra.length()-1));
            }
	}
	return false;
    }

    public static boolean prime(BigInteger x){
	//	System.out.println("big: "+x.toString());

	if(x.compareTo(BigInteger.ONE)==0||x.compareTo(BigInteger.ZERO)==0){
	    return false;
	}else if((x.mod(BigInteger.valueOf(2))).compareTo(BigInteger.ZERO)==0){
	    return false;
	    
	}else if(x.compareTo(BigInteger.valueOf(7))==1){
	    //	    System.out.println("mayor");
	    for(BigInteger z = new BigInteger("3"); (z.multiply(z)).compareTo(x)==-1||(z.multiply(z)).compareTo(x)==0; z=z.add(BigInteger.valueOf(2))){
		//	System.out.println(z);
		if(x.mod(z).compareTo(BigInteger.ZERO)==0){
		    return false;
		}
	    }
	}
	return true;
    }

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
    
	String nbig = sc.next();
	BigInteger n = new BigInteger(nbig);
	boolean man = true;
	
	while(man){
	    if(palind(n.toString())){
		//		System.out.println("palind: "+n);
		if(prime(n)){
		    //		    System.out.println("prime: "+n);
		    System.out.print(n);
		    man=false;
		}
	    }
	    n=n.add(BigInteger.ONE);
	}
    }
}
