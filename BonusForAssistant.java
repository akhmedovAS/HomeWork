public class BonusForAssistant extends Bonus {
     final int percentOfBonus = 20;

     @Override
     public int getBonus() {
          yourBonus = (bonusSum / 100) * percentOfBonus;
          return yourBonus;
     }

}
