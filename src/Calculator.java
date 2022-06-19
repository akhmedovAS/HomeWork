public class Calculator {

    private ICalculator calc;
    private int a;
    private int b;

    public Calculator(ICalculator calc) {
        this.calc = calc;
    }

    public int goFcnCalculate(int a, int b) {
        return calc.calculate(a, b);
    }
    public Calculator() {

    }

    public void setCalculate(ICalculator calc) {
        this.calc = calc;
    }
}
