import java.util.Scanner;
public class Factorconnect {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Factorial factor = new Factorial();
	
                System.out.println("input a number"); 
		int number = input.nextInt();  

		int result  = factor.factorial(number);
		
		System.out.println(result);


	}
}