import java.util.Scanner;
public class Scanner_demo {
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two number : " ); 
		
		int num1 = input.nextInt(); 
		int num2 = input.nextInt(); 
		
		
		
		//
		
		
		boolean done = true; 
		
		do { 
			System.out.println("1. Addition "); 
			System.out.println("2. Substraction "); 
			System.out.println("3. Mutiplication"); 
			System.out.println("Please Enter your choice : ");
			int ch = input.nextInt(); 
			
		
			switch(ch)
			{
			case 1: { 
				int add = num1 + num2 ; 
				System.out.println("The Addtion of " + num1 + " and " + num2 + " is : " + add);
				done = true ;
				break ; 
			}
			case 2: 
			{ 
				int multi = num1 * num2 ; 
				System.out.println("The Multiplication of " + num1 + " and " + num2 + " is : " + multi); 
				done = true ; 
				break ; 
				
			
			}
			
			case 3: 
			{
				int subs = num1 - num2 ; 
				System.out.println("The substraction of " + num2 + " from " + num1 + " is : " + subs); 
				done = true ; 
				break ; 
				
				
			}
			default : 
			{
				System.out.println("WRONG INPUT"); 
				System.out.println("please enter your input again!"); 
				done = false ; 
				break ; 
			}
			}
			
		
		}while(done == false ); 
				
				
					
		
		
		
		
		
		input.close(); 

		
		
	}
	

}
