public class BonusForWorker extends Bonus {
    private final int percentOfBonus = 10;

    @Override
    public int getBonus() {
        yourBonus = (bonusSum / 100) * percentOfBonus;
        return yourBonus;
    }

}
