public class SectionNewGame extends GameMenu{

    @Override
    protected void userChoice(int userChoice){
        System.out.println("Вы перешли в раздел меню "+ userChoice+". \"Начать новую игру\"");
    }

}
