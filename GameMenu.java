public class GameMenu {

    public void showMenu() {
        System.out.println("Меню игры:");
        System.out.println("1. \"Начать новую игру\"");
        System.out.println("2. \"Продолжить\"");
        System.out.println("3. \"Настройки\"");
        System.out.println("4. \"Выйти\"");
    }

    protected void userChoice(int userChoice){
        System.out.println("Вы перешли в раздел меню "+ userChoice);
    }
}
