import java.util.*;
class Pattern10{
	public static void main(String args[]){
	
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows::- ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++){
			int ch = 65;
			for(int j = 1; j <= row; j++){
				
				System.out.print(j+""+(char)ch+"  ");

				ch++;
			}
			System.out.println();
		
		}
	
	}



}
