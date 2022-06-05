import org.junit.Test;

import static org.junit.Assert.*;

public class FurnitureConstructorTest {

    @Test
    public void testUserType() {
        FurnitureConstructor furnitureConstructor = new FurnitureConstructor();
        assertEquals(FurnitureType.CUPBOARD,furnitureConstructor.userType("шкаф"));
        assertEquals(FurnitureType.CHAIR,furnitureConstructor.userType("стул"));
        assertEquals(FurnitureType.TABLE,furnitureConstructor.userType("стол"));
        assertEquals(FurnitureType.BED,furnitureConstructor.userType("Кровать"));
        assertEquals(FurnitureType.DEFAULT,furnitureConstructor.userType("аквлп"));
    }
}