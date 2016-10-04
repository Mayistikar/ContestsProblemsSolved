import java.util.Scanner;
import java.util.LinkedList;


class HallPreparation{

    public static void imprimir(int[][] s, int nx, int mx){
	    for(int z = 0; z < nx; z++){
		for(int k=0; k<mx; k++){
		    System.out.print(s[z][k]);
		}
		System.out.println("");
	    }
    }

    public static int verRepet(int[][] s, int i, int j, LinkedList<Integer> r){
	if(s[i][j]==-1){
	    return 0;
	}
	for(int z=0; z<r.size(); z++){
	    if(s[i][j]==r.get(z)){
		return 0;
	    }
	}
	
	if(s[i-1][j-1]==s[i][j]){
	    r.add(s[i][j]);
	    return 1;
	}else if(s[i-1][j]==s[i][j]){
	    r.add(s[i][j]);
	    return 1;
	}else if(s[i-1][j+1]==s[i][j]){
	    r.add(s[i][j]);
	    return 1;
	}else if(s[i][j-1]==s[i][j]){
	    r.add(s[i][j]);
	    return 1;
	}else if(s[i][j+1]==s[i][j]){
	    r.add(s[i][j]);
	    return 1;
	}else if(s[i+1][j-1]==s[i][j]){
	    r.add(s[i][j]);
	    return 1;
	}else if(s[i+1][j]==s[i][j]){
	    r.add(s[i][j]);
	    return 1;
	}else if(s[i+1][j+1]==s[i][j]){
	    r.add(s[i][j]);
	    return 1;
	}
	return 0;
    }
    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();
	int n, m, nx, mx;
	int contador = 0;
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(-2);
	list.add(-2);
	while(t>0){

	    n = sc.nextInt();
	    m = sc.nextInt();

	    nx = n+2;
	    mx = m+2;

	    int[][] hall = new int[nx][mx];

	    for(int i = 0; i < nx; i++){
		for(int j = 0; j < mx; j++){
		    if(i>0 && j>0 && i<=n && j<=m){
			hall[i][j]=sc.nextInt();
		    }else{
			hall[i][j]=-2;
		    }
		}
	    }
	    //	    imprimir(hall, nx, mx);

	    for(int p = 1; p<nx-1; p++){
		for(int u = 1; u<mx-1; u++){
		    //  System.out.println(hall[p][u]);
		    contador+=verRepet(hall,p,u,list);
		    //  System.out.println("c:"+contador);
		}
	    }
	    list.clear();
	    System.out.println(contador);
	    contador=0;
	    t--;
	}



    }
    
}
