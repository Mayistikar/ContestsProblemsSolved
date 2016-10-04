import java.util.Scanner;

class EnteroBinario{

    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int numeroDecimal = sc.nextInt();
	String binario = Integer.toBinaryString(numeroDecimal);
	System.out.print(binario);
    }
    
}
