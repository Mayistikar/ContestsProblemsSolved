import java.util.Scanner;
import java.util.Arrays;


class Private{

    public static int calc(String sx){

	int total = 0;
	char[] scx = sx.toCharArray();
	for(char x: scx){
	    total+=Integer.valueOf(x)-96;
	}
	return total;
    }

    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	String s, sold;
	String[] file;

	while(n>0){

	    sold=sc.next();
	    s=sold.toLowerCase();

	    file = s.split("\\.");
	    
	    if(calc(file[0])!=calc(file[1])){
		System.out.println(sold);
	    }
	    n--;
	}

    }

}
