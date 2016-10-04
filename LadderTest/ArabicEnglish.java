import java.util.Scanner;
import java.util.Arrays;

class ArabicEnglish{

    public static void main(String[]ars){

	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();
	int n;
	String word;
	String eng = "";
	char[] c;
	String[] s;
	int indice;
	int num = -1;
	int contador=0;

	while(t>0){

	    n = sc.nextInt();
	    s = new String[n];
	    
	    while(n>0){

		word = sc.next();
		c = word.toCharArray();
		if(c[0]!='#'){
		    eng = word;
		    num = contador;
		}
		s[contador]=word;
		contador++;
		n--;
	    }
	    if(num>-1){
		for(int x=num+1; x<s.length; x++){
		    System.out.print(s[x]+" ");
		}
		System.out.print(eng);
		for(int y=0; y<num; y++){
		    System.out.print(" "+s[y]);
		}

		System.out.println("");
	    }else{
		for(int z=0; z<s.length-1; z++){
		    System.out.print(s[z]+" ");		    
		}
		System.out.println(s[s.length-1]);

	    }
	    contador=0;
	    num=-1;
	    t--;
	}
    }
}
