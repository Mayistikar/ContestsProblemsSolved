import java.util.Scanner;
import java.util.Arrays;

public class MrRobot{

    public static String binario(String s){
	String sx="";
	String lsx="";
	char[] ls = s.toCharArray();
	
	for(int x=0; x<ls.length;x++){
	    sx += Integer.toBinaryString((int)ls[x]);
	    while((8-sx.length())>0){
		sx="0"+sx;
	    }
	    lsx+=sx;
	    sx="";
	}
	return lsx;
    }

    public static boolean[] arreglo(String s){
	char[] ch = s.toCharArray();
	boolean[] boolArr = new boolean[s.length()];
	for(int p=0; p<s.length(); p++){
	    if(ch[p]=='1'){
		boolArr[p]=false;
	    }else{
		boolArr[p]=true;
	    }
	}
	return boolArr;
    }
    
    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();
	String sword, eword, S, E, K="";
	boolean[] sch, ech;
	
	while(t>0){
	    sword = sc.next();
	    eword = sc.next();

	    S=binario(sword.toUpperCase());
	    E=binario(eword.toUpperCase());

	    sch = arreglo(S);
	    ech = arreglo(E);
	
	
	    for(int x=0; x<sch.length; x++){
		if(sch[x]^ech[x]){
		    K+='1';
		}else{
		    K+='0';
		}
	    }
	    
	    System.out.println(K);
	    K="";
	    t--;
	}
    }

}
