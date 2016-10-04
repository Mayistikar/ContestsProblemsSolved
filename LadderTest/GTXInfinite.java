import java.util.Scanner;
import java.util.Arrays;

class GTXInfinite{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	int[] list = new int[n];
	for(int x=0; x<n; x++){
	    list[x] = sc.nextInt();
	}
	Arrays.sort(list);
	for(int y=0; y<n; y++){

	    System.out.println(list[y]);
	}
    }
}
