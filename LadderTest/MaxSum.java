import java.util.Scanner;

class MaxSum{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int max = a;
	if(max<b){
	    max=b;
	}
	if(max<c){
	    max=c;
	}
	if(((b+c+a)-max)>max){
	    System.out.print((b+c+a)-max);
	}else{
	    System.out.print(max);
	}
    }
}
