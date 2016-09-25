import java.util.Scanner;
import java.util.ArrayList;


public class StringTask{
    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	String line = sc.next();

	line=line.toLowerCase();  

	char[] line2 = line.toCharArray();

	for(int x=0; x<line2.length; x++){

	    switch(line2[x]){
	    case 'a':
		line2[x]='-';
		break;
	    case 'e':
		line2[x]='-';
		break;
	    case 'i':
		line2[x]='-';
		break;
	    case 'o':
		line2[x]='-';
		break;
	    case 'u':
		line2[x]='-';
		break;
	    case 'y':
		line2[x]='-';
		break;
	    }
	}
	
	String line3 = String.valueOf(line2).replace("-","");
	line="";
	for(String x:line3.split("")){
	    line+="."+x;
	}
	System.out.println(line);
    }


}
