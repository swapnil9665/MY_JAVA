import java.util.*;
class Prog9{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of row::- ");
		int row = sc.nextInt();


	if(row%2 ==0){	
		for(int i = 1;i<=row;i++){
		int num = 65;	
			for(int j = 1;j<=row;j++)
			{
			
			if(j<=i-1){
			
				System.out.print("\t");
			
			}else{

				if(j%2 == 0){
				System.out.print(""+(char)num+"\t");
				}else{
				System.out.print(num+"\t");
				}
			}

			
			num++;
			}
			
			System.out.println();
		
		
		
		}

	}else{
	
	
	 for(int i = 1;i<=row;i++){
                int num = 65;
                        for(int j = 1;j<=row;j++)
                        {

                        if(j<=i-1){

                                System.out.print("\t");

                        }else{

                                if(j%2 == 0){
                                System.out.print(num+"\t");
                                }else{
                                System.out.print(""+(char)num+"\t");
                                }

                        }


                        num++;
                        }

                        System.out.println();



        }	
	
	
	
	}
	
	
	
	
	}





}
