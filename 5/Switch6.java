import java.util.*;
class Switch6{
public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int num=sc.nextInt();

        switch(num){

                case 0:
                        System.out.println("zero");
                        break;

                case 1:
                        System.out.println("One");
                        break;

                case 2:
                        System.out.println("Two");
                        break;


		case 3:
			System.out.println("Three");
			break;

		case 4:
                        System.out.println("Four");
                        break;

		 case 5:
                        System.out.println("Five");
                        break;

                default :
			if(num>5)
                        System.out.println("Entered number is greater than 5.");
        }
}}
