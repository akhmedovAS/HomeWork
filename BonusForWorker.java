public class BonusForWorker extends Bonus {
    final int percentOfBonus = 10;

    @Override
    public int getBonus() {
        yourBonus = (bonusSum / 100) * percentOfBonus;
        return yourBonus;
    }

}
