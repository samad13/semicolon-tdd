import java.util.Scanner;
public class TwoInt{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	TwoIntegers check = new TwoIntegers();


	System.out.print("enter number1: ");  
        int num1 = input.nextInt();

	System.out.print("enter number2: ");  
        int num2 = input.nextInt();

	int result = check.two(num1, num2);
	

	System.out.printf("result : %d", result );  
	


	


	}
}
