import java.util.Scanner;
public class EvenOrOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	

	int even = 0;
	int odd = 0;
	
	for(int i = 0; i < 10; i++){
	System.out.print("enter number to check the sum of even or odd number: ");  
        int num = input.nextInt();
	if(num % 2 == 0){
	even+=num;
	}else 
	odd+=num;

}
	
	

	System.out.printf(" even: %d  %n odd: %d", even, odd);  
	


	


	}
}
