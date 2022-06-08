import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Укажите вашу должность: ");
        Scanner scanner = new Scanner(System.in);
        String workPosition = scanner.nextLine();

        Bonus bonus[] = {new BonusForDirector(), new BonusForAssistant(), new BonusForWorker()};

        switch (workPosition.toLowerCase()){
            case "рабочий":
                System.out.println("Эй, "+workPosition+" твоя премка составила "+bonus[2].getBonus());
                break;
            case "помощник":
                System.out.println("Эй, "+workPosition+" твоя премка составила "+bonus[1].getBonus());
                break;
            case "директор":
                System.out.println("Эй, "+workPosition+" твоя премка составила "+bonus[0].getBonus());
                break;
            default:
                System.out.println("У нас нет такой должности как "+workPosition +", уходите");
                break;
        }

    }

}
