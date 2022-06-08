import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Это конвертер температурных значений");
        System.out.println("Введите количество градусов, цифрой:");
        int degree = scanner.nextInt();
        System.out.println("Введите в какой единице измерения вы указали градусы: С или F: ");
        String measureUnit = scanner1.nextLine();

        Temperature incomeTemperature = new Temperature(degree, measureUnit);
        ConvertFarToCel convertFarToCel = new ConvertFarToCel();
        ConvertCelToFar convertCelToFar = new ConvertCelToFar();

        if (measureUnit.equalsIgnoreCase("F")) {
            System.out.println(convertFarToCel.converter(incomeTemperature).toString());
        } else if (measureUnit.equalsIgnoreCase("C")) {
            System.out.println(convertCelToFar.converter(incomeTemperature).toString());
        }
    }


}
