import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;

class Series{

    //Permite transofrmar un binario a hexadecimal
    public static String numHexadecimal(String[] binario){
	String binariox = Arrays.toString(binario).replace(",","").replace(" ","").replaceAll("[\\[\\]]","");
	BigInteger num = new BigInteger(binariox,2);
	//	BigInteger toHex = new BigInteger(binariox, 10);
	//	System.out.println("++"+num+" "+toHex+"++");
	return num.toString(16).toUpperCase();
    }

    //Permite transformar la linea de la serie a un arreglo binario correcto incluyendo los ceros
    public static String[] arregloBinario(int kx, String hexax){
	int numHexa = Integer.parseInt(hexax, 16);
	String binario = Integer.toBinaryString(numHexa);
	String binario2 = "";
	String[] listaBinar;
	int ceros = kx-binario.length();

	if(ceros != 0){
	    for(int i=0; i<ceros; i++){
		binario2+="0";
	    }
	    binario2+=binario;
	    listaBinar=binario2.split("");
	    //	    System.out.println(Arrays.toString(listaBinar));
	    return listaBinar;
	}
	listaBinar = binario.split("");
	//	System.out.println(Arrays.toString(listaBinar));
	return listaBinar;
    }

    //Permite encontrar el indice anterior a "ai" cuando listaBinaria[ai] == 0
    public static int posicionA(int ai, String[] listaBinaria){
	int aix = ai;
		
	while(listaBinaria[ai].equals("0")){
	    ai--;
	    if(ai<0){
		return aix;
	    }
	}
	return ai;
    }

    //Permite encontrar el indicd siguiente a "bi" cuando listaBinaria[bi] == 0
    public static int posicionB(int bi, String[] listaBinaria){
	int bix = bi;

	while(listaBinaria[bi].equals("0")){
	    bi++;
	    if(bi>=listaBinaria.length){
		return bix;
	    }
	}
	return bi;
    }

    // Transforma el arreglo segun el algoritmo del problema y devuelve un string
    public static String transf(int ai, int bi, String[] listaBinaria){
	int aix;
	int bix;
	
	//	System.out.println(Arrays.toString(listaBinaria));

	if(listaBinaria[ai].equals("0") && listaBinaria[bi].equals("0")){
	    aix = posicionA(ai, listaBinaria);
	    bix = posicionB(bi, listaBinaria);
	    for(int z=aix; z<=bix; z++){
		if(listaBinaria[z].equals("0")){
		    listaBinaria[z]="1";
		}else{
		    listaBinaria[z]="0";
		}
	    }
	    return Arrays.toString(listaBinaria).replace(",","").replace(" ","").replaceAll("[\\[\\]]","");
	}

	if(listaBinaria[ai].equals("1") && listaBinaria[bi].equals("0")){
	    bix = posicionB(bi, listaBinaria);
	    //	    System.out.println(bix);
	    for(int z=ai; z<=bix; z++){
		if(listaBinaria[z].equals("0")){
		    listaBinaria[z]="1";
		}else{
		    listaBinaria[z]="0";
		}
	    }
	    return Arrays.toString(listaBinaria).replace(",","").replace(" ","").replaceAll("[\\[\\]]","");
	}

	if(listaBinaria[ai].equals("0") && listaBinaria[bi].equals("1")){
	    aix = posicionA(bi, listaBinaria);
	    for(int z=aix; z<=bi; z++){
		if(listaBinaria[z].equals("0")){
		    listaBinaria[z]="1";
		}else{
		    listaBinaria[z]="0";
		}
	    }
	    return Arrays.toString(listaBinaria).replace(",","").replace(" ","").replaceAll("[\\[\\]]","");
	}

	if(listaBinaria[ai].equals("1") && listaBinaria[bi].equals("1")){
	    for(int z=ai; z<=bi; z++){
		if(listaBinaria[z].equals("0")){
		    listaBinaria[z]="1";
		}else{
		    listaBinaria[z]="0";
		}
	    }
	    return Arrays.toString(listaBinaria).replace(",","").replace(" ","").replaceAll("[\\[\\]]","");
	}
	return "0000xxxx0000";
    }

    
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt(); // Numero de casos a evaluar
	int k; // Tamano de serie
	int m; // Segundos
	int ai; // posicion a de la serie
	int bi; // posicion b de la serie
	String hexa; // Cadena de la serie
	String[] provisoria;

	//	System.out.println(Arrays.toString(arregloBinario(18, "EA642")));
	
	while(t>0){

	    k = sc.nextInt();
	    m = sc.nextInt();
	    hexa = sc.next();
	    provisoria = arregloBinario(k, hexa);
	    while(m>0){
		ai = sc.nextInt()-1;
		bi = sc.nextInt()-1;

		provisoria = transf(ai, bi, provisoria).split(""); // Linea importante
		//System.out.println(Arrays.toString(provisoria));
		
		m--;
	    }
	    System.out.println(numHexadecimal(provisoria));
	    t--;
       }


    }
}

