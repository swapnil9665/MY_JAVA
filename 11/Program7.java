import java.util.*;
class Program7{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter no. of row::- ");
int row  = sc.nextInt();

for(int i = 1;i<=row;i++){

	for(int j = 1; j<=row-i+1; j++){
		
		System.out.print(j+"\t");
		
		}
	

	
	System.out.println();
	}



}




}
