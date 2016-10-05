import java.util.Scanner;
import java.util.Arrays;

class NewCellPhone{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	String[][] mat = new String[n][3];
	String search, var;

	for(int x=0;x<n;x++){
	    for(int y=0;y<3;y++){
		mat[x][y]=sc.next();
	    }
	}

	int u = sc.nextInt();
	while(u>0){
	    search = sc.next();

	    for(int i=0;i<n;i++){

		if(mat[i][0].toLowerCase().equals(search.toLowerCase())){
		    mat[i][1]=sc.next();
		    mat[i][2]=sc.next();
		}
	    }
	    u--;
	}
	for(int j=0;j<n;j++){
	    for(int k=0;k<2;k++){
		System.out.print(mat[j][k]+" ");		
	    }
	    System.out.print(mat[j][2]);
	    System.out.println("");
	}

    }



}
