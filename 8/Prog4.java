import java.util.*;
class Pattern4{
	public static void main(String args[]){
	
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows::- ");
		int row = sc.nextInt();
		int num=1;
		for(int i = 1; i <= row; i++){
		
			for(int j = 1; j <= row; j++){
			
				System.out.print(num+" ");
				num++;

			
			}
			System.out.println();
		
		}
	
	}



}
