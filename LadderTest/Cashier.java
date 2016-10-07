import java.util.Scanner;
import java.util.LinkedList;

class Cashier{
	
	public static void addList(LinkedList<Node> listx, int numx){
		for(int i=0; i<listx.size(); i++){
			if(listx.get(i).getNum==numx){
				listx.get(i).setCant(listx.getCant()+1);
			}else if(numx>listx.get(i).getNum){
				
			}
		}
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = 101;
		LinkedList<Node> list = new LinkedList<Node>();
		while(n!=0){
			
			n=sc.nextInt();
			
			
		}
		
	}
}
