import java.util.Scanner;

class BallonsColors{

    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	int n, x, y, balloon;
	boolean easiest = false;
	boolean hardest = false;
	
	while(t>0){

	    n=sc.nextInt();
	    x=sc.nextInt();
	    y=sc.nextInt();

	    for(int i=0; i<n; i++){
		balloon = sc.nextInt();
		if(i==0 && balloon == x){
		    easiest = true;
		}
		if(i==(n-1) && balloon == y){
		    hardest = true;
		}
	    }
	    if(easiest && hardest){
		System.out.println("BOTH");
	    }else if(easiest){
		System.out.println("EASY");		
	    }else if(hardest){
		System.out.println("HARD");
	    }else if(!easiest && !hardest){
		System.out.println("OKAY");
	    }
	    easiest = false;
	    hardest = false;
	    t--;
	}
    }
}
