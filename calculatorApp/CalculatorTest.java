import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class  CalculatorTest{

	@Test
	public void testThatCalculatorCanAddTwoPositiveNumbers(){


	Calculator calculator = new Calculator();
	int result = calculator.add(2, 3);

	assertEquals(5, result);


}

	@Test
	public void testThatChecksIfCalculatorSubtractsPositiveNumbers(){

	
	Calculator calculator = new Calculator();
	int difference = calculator.subtract(7, 3);
	assertEquals(4, difference);

}

	
	@Test
	public void testThatChecksIfTheCalculatorMultipliesPositiveNumber(){
	
	Calculator calculator = new Calculator();
	int theProduct = calculator.multiply(21, 5);

	assertEquals(105,theProduct);
}

	
}