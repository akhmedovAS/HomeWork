public class BonusForDirector extends Bonus {
    private final int percentOfBonus = 50;

    @Override
    public int getBonus() {
        yourBonus = (bonusSum / 100) * percentOfBonus;
        return yourBonus;
    }
}
