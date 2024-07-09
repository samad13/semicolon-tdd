import java.util.Scanner;

public class Number {
    
    public int score(int numb1, int numb2) {
                
        int score = 0;
                for (int i = 1; i <= numb1; i++) {
            score += numb2;  }
        
            
        return score;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter numb1: ");
        int numb1 = input.nextInt();
        
        System.out.print("Enter numb2: ");
        int numb2 = input.nextInt();
        
        Number numberCalculator = new Number();
        int result = numberCalculator.score(numb1, numb2);
        
        System.out.println("Score: " + result);
        
       }
}
