import java.util.*;
class Prog8{


public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter no. of rows::- ");
int row = sc.nextInt();


for(int i = 1; i <= row; i++){
	int num2  = i;
	for(int j = 1; j<= row; j++){
	
		System.out.print(num2+" ");
		num2+=i;
	}
	
	System.out.println();

}












}


}
