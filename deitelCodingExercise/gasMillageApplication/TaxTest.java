import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class  TaxTest{

	@Test
	public void testTax(){

	Tax calculate = new Tax();
	double interest = calculate.amount(30000);

	assertEquals(4500, interest);


}


	@Test
	public void testTaxInvalidAmount(){

	Tax calculate = new Tax();
	//double interest = calculate.amount(-30000);

	assertThrows(RuntimeException.class, ()->calculate.amount(-30000));


}}