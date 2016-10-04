import java.util.Scanner;

class CountingMStars{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	for(int x=1; x<=n;x++){
	    for(int z=1; z<=x; z++){
		System.out.print('*');
	    }
	    System.out.println("");
	}
	
    }
}
