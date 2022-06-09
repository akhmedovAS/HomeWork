import static org.junit.Assert.*;

public class BonusForWorkerTest {

    @org.junit.Test
    public void getBonus() {
        Bonus bonus = new BonusForWorker();
        assertEquals(100000,bonus.getBonus());
    }
}