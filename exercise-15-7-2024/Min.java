import java.util.Scanner;
public class Min{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	MinMax check = new MinMax();
	String result = "";
	for(int count = 1; count <= 10; count++){
	System.out.print("enter number: ");  
        int num = input.nextInt();
	 result = check.updateMinMax(num);
}
	System.out.print(result );  
	
	}
}

