import java.util.*;
class IfElse1{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check");
	int num=sc.nextInt();

	if(num>=100 && num<=1000){
	
		System.out.println(num+" is in the range 1 to 1000.");


	}else{
	
		System.out.println(num+" is not in the range 1 to 1000");
	
	}



}


}
