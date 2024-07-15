import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		

	int reversnum = 0;
	System.out.print("enter number: ");  
        int number = input.nextInt();
	while(number > 0){
		
	reversnum   = (reversnum * 10) + (number % 10);
		
	number = number / 10;
	}
	
	System.out.print(reversnum ); 
	
	}
}

