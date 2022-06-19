import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Напишите, что хотите посчитать через пробел:");
        Scanner scanner = new Scanner(System.in);

        String[] userValue = scanner.nextLine().split(" ");
        ICalculator [] operations = {new Addition(), new Subtraction(), new Multiplication(), new Division()};

        Calculator calculator = new Calculator();

        if (userValue[1].equals("+")) {
            calculator.setCalculate(operations[0]);
            System.out.println(calculator.goFcnCalculate(Integer.parseInt(userValue[0]),Integer.parseInt(userValue[2])));
        }
        else if (userValue[1].equals("-")){
            calculator.setCalculate(operations[1]);
            System.out.println(calculator.goFcnCalculate(Integer.parseInt(userValue[0]),Integer.parseInt(userValue[2])));
        }
        else if (userValue[1].equals("*")){
            calculator.setCalculate(operations[2]);
            System.out.println(calculator.goFcnCalculate(Integer.parseInt(userValue[0]),Integer.parseInt(userValue[2])));
        }
        else if(userValue[1].equals("/")){
            calculator.setCalculate(operations[3]);
            System.out.println(calculator.goFcnCalculate(Integer.parseInt(userValue[0]),Integer.parseInt(userValue[2])));
        }


    }
}
