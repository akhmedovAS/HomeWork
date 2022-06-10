import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GameMenu gameMenu[] = {new GameMenu(), new SectionNewGame(), new SectionContinue(), new SectionSettings(), new SectionExit()};


        while (true) {
            gameMenu[0].showMenu();
            System.out.println("Выберите пункт меню, написав его номер:");
            int inputUserValue = scanner.nextInt();

            switch (inputUserValue) {
                case 1:
                    gameMenu[1].userChoice(inputUserValue);
                    break;
                case 2:
                    gameMenu[2].userChoice(inputUserValue);
                    break;
                case 3:
                    gameMenu[3].userChoice(inputUserValue);
                    break;
                case 4:
                    gameMenu[4].userChoice(inputUserValue);
                    break;
                default:
                    System.out.println("Нет такого пункта");
            }
        }

    }
}
