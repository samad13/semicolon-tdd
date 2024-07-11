import java.util.Scanner;

public class Tax {
    
    public double amount(int amount) {
       double paid = 0;
	if(amount <= 0){
	throw new RuntimeException("invalid amount");
	}else if(amount == 30000 )   {
	paid = amount * 0.15;
	}else if(amount > 30000 ) {   
          paid = amount * 0.2;
}
        return paid;
    }
    

   public static void main(String[] args) {

	for (int i = 1;i <= 3 ; i++ ){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Salary: ");
        int salary = input.nextInt();
        
       Tax Calculate = new Tax ();
        double result = Calculate.amount(salary);
        
        System.out.println("this " + name + " tax "+  result);
        
       }}
}
