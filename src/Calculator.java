/**
 * Класс для основных функций калькулятора
 */
public class Calculator {
    int firstNum;
    int secondNum;

    /**
     * @param firstNum  Первое число
     * @param secondNum Второе число
     * @return Результат сложения
     */
    int addition(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        return sum;
    }

    /**
     * @param firstNum  Первое число
     * @param secondNum Второе число
     * @return Результат вычитания
     */

    int subtraction(int firstNum, int secondNum) {
        int sum = firstNum - secondNum;
        return sum;
    }

    /**
     * @param firstNum  Первое число
     * @param secondNum Второе число
     * @return Результат умножения
     */
    int multiplication(int firstNum, int secondNum) {
        int sum = firstNum * secondNum;
        return sum;
    }

    /**
     * @param firstNum  Первое число
     * @param secondNum Второе число
     * @return Результат деления
     */
    int division(int firstNum, int secondNum) {
        int sum = firstNum / secondNum;
        return sum;
    }

}
