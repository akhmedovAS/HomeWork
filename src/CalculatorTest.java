import org.junit.Test;


import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addition() {
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.addition(2,2));

    }

    @Test
    public void subtraction() {
        Calculator calculator = new Calculator();
        assertEquals(9,calculator.subtraction(10,1));
    }

    @Test
    public void multiplication() {
        Calculator calculator = new Calculator();
        assertEquals(85,calculator.multiplication(17,5));
    }

    @Test
    public void division() {
        Calculator calculator = new Calculator();
        assertEquals(30,calculator.division(90,3));
    }
}