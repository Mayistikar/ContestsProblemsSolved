import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ThemTwice{

    public static void main(String[]args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String linea1 = br.readLine();
	String linea2 = br.readLine();
	String linea3 = br.readLine();

	System.out.println(linea1+" "+linea2+" "+linea3);

    }
}
