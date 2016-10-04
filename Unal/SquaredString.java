import java.util.Scanner;
import java.util.Arrays;

class SquaredString{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	String line = sc.next();
	int c = line.length();
	int contador = c-1;
	char[] x = line.toCharArray();
	char[] xcont = line.toCharArray();

	for(int z=0; z<c; z++){
	    xcont[contador] = x[z];
	    contador--;
	}

	System.out.println(line);
	for(int z=0; z<c-1; z++){
	    System.out.print(xcont[z]);
	    for(int y=0; y<(c-2); y++){
		System.out.print(" ");
	    }
	    System.out.println(x[z]);
	}
	System.out.print(String.valueOf(xcont));
    }
}
