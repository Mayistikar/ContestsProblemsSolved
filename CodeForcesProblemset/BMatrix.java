import java.util.Scanner;

public class BMatrix{

    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	int num=0;
	int fila=0;
	int colum=0;
	int movsx=0;
	int movsy=0;
	
	for(int x=1; x<=5; x++){
	    for(int y=1; y<=5; y++){
		num=sc.nextInt();
		if(num!=0){
		    fila=x;
		    colum=y;
		}
	    }
	}

	movsx=fila-3;
	movsy=colum-3;

	if(movsx<0){
	    movsx=movsx*(-1);
	}
	if(movsy<0){
	    movsy=movsy*(-1);
	}
	System.out.println(movsx+movsy);
    }
}
