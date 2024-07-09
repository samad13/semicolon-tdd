import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMillageCalculatorTest{

@Test
public void testCanCalculatorMilesPerGallon(){

	//given 
GasMillageCalculator calculator = new GasMillageCalculator();
	//when

double numberOfMilesDriven = 30.00;
double numberOfGallons = 20;

double milesPerGallon = calculator.computerMilesPerGallon(numberOfMilesDriven, numberOfGallons);
	//assert
	assertEquals(3,  milesPerGallon);


}     }                                                
