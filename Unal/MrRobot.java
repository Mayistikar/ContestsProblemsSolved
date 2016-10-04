import java.util.Scanner;
import java.util.Arrays;

public class MrRobot{

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();
	while(t>0){
	    String s = sc.next();
	    String k = sc.next();
	    int tam = s.length();
	    String sx="";
	    String kx="";
      
	    char[] sch = new char[tam];
	    char[] kch = new char[tam];
	    boolean[] sbol;
	    boolean[] kbol;
	
	    for(int x=0; x<tam;x++){
		sx += Integer.toBinaryString(s.codePointAt(x));
		kx += Integer.toBinaryString(k.codePointAt(x));
	    }
	    System.out.println(sx);
	    System.out.println(kx);
	    char[] e = new char[sx.length()];
	    sbol = new boolean[sx.length()];
	    kbol = new boolean[sx.length()];
	    
	    sch = sx.toCharArray();
	    kch = kx.toCharArray();

	    for(int y=0; y<sx.length(); y++){

		if(sch[y]=='1'){
		    sbol[y]=true;
		}else{
		    sbol[y]=false;
		}

		if(kch[y]=='1'){
		    kbol[y]=true;
		}else{
		    kbol[y]=false;
		}
	    
		if(sbol[y] ^ kbol[y]){
		    e[y]='1';
		}else{
		    e[y]='0';
		}
	    }
	    System.out.println(Arrays.toString(e));
	    t--;
	}
    }

}
