import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void goFcnCalculate() {
        ICalculator [] operations = {new Addition(), new Subtraction(), new Multiplication(), new Division()};
        Calculator calculator = new Calculator();
        calculator.setCalculate(operations[0]);
        assertEquals(4,calculator.goFcnCalculate(2,2));
        calculator.setCalculate(operations[1]);
        assertEquals(3,calculator.goFcnCalculate(10,7));
        calculator.setCalculate(operations[2]);
        assertEquals(100,calculator.goFcnCalculate(25,4));
        calculator.setCalculate(operations[3]);
        assertEquals(3,calculator.goFcnCalculate(9,3));
    }
}