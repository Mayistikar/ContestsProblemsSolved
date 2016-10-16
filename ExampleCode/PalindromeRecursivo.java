import java.util.Scanner;

class PalindromeRecursivo{

    public static boolean palind(String palabra){
	System.out.println(palabra);
	if(palabra.length()==1||palabra.length()==0){
	    return true;
	}else if(palabra.length()>1){
	    if(palabra.charAt(0)==palabra.charAt(palabra.length()-1)){
		return palind(palabra.substring(1,palabra.length()-1));
	    }
	}
	return false;
    }

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	String palabra = sc.next();

	if(palind(palabra)){
	    System.out.println("Es palindromo");
	}else{
	    System.out.println("NO es palindromo");
	}

	
    }
}
