import java.util.*;
class Program5{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter no. of row::- ");
int row  = sc.nextInt();

for(int i = 1;i<=row;i++){
	int num = row;
	for(int j = 1; j<=i; j++){
		
		System.out.print(num+"\t");
		num +=row;
		}

	
	System.out.println();
	}



}




}
