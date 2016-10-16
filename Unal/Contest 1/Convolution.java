import java.util.Scanner;

class Convolution{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int n, m, p, q;

	n=sc.nextInt();
	m=sc.nextInt();
	p=sc.nextInt();
	q=sc.nextInt();

	int contador=0;

	int[][] mat = new int[n][m];

	for(int i=0; i<n; i++){
	    for(int j=0; j<m; j++){
		mat[i][j]=sc.nextInt();
	    }	   
	}

	for(int k=0; k<=(n-p); k++){
	    for(int l=0; l<=(m-q); l++){

		for(int r=k; r<(k+p); r++){
		    for(int s=l; s<(l+q); s++){
			//			System.out.println("val:"+mat[r][s]);
			contador+=mat[r][s];
		    }
		}

		System.out.print(contador);
		if(l!=(m-q)){
		    System.out.print(" ");
		}
		contador=0;
	    }
	    if(k!=(n-p)){
		System.out.print("\n");
	    }	    
	}
    }
}
