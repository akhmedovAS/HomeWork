public class Bonus {
    final public int bonusSum = 1000000;
    public int percentOfBonus;
    public int yourBonus;

    public int getBonus(){
        yourBonus = (bonusSum/100)*percentOfBonus;
        return yourBonus;
    }







}
