import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest{

@Test
public void testNumberWithOutX(){

	//given 
Number calculator = new Number();
	//when

int numb1 = -2;
int numb2 = 4;

int answer = calculator.score(numb1 , numb2);
	//assert
	assertEquals(-8,  answer);


}     }                                                
