package ExceptionHandling;
import java.util.Scanner;
public class ExceptionHandle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number:");
		int a = sc.nextInt();
		System.out.println("Enter your second number:");
		int b = sc.nextInt();
		System.out.println("Here i am writing exception handling program:");
		
		// IN EXCEPTION HANDLING IN ALL THESE THREE BLOCKS try{} BLOCK IS MANDATORY FIELD AND 
		// FINALLY AND CATCH ARE OPTIONAL  BUT ATLEAST ONE OF THEM SHOULD BE THERE BOTH SHOULD'NT BE REOMOVED AT A TIME 
		// AT LEAST ONE OF THEM MUST BE THERE IN THE CODE
		try {
			int result = a/b;
			int mul = a*b;
			System.out.println("Division result is: "+result);  
			System.out.println("Multiplication result: "+mul);
		}
		catch(ArithmeticException ae){
			System.out.println(ae.toString());
		}
		finally {
			System.out.println("This finally block will execute all time...");
		}

	}

}
