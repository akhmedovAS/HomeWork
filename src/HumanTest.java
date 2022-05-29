import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void setName() {
        Human human = new Human("Петя", "Иванов", "Петявич", 30);
        human.setName("Игорь");
    }

    @Test
    public void getName() {
        Human human = new Human("Петя", "Иванов", "Петявич", 30);
        assertEquals("Петя", human.getName());

    }

    @Test
    public void setSecondName() {
        Human human = new Human("Петя", "Иванов", "Петявич", 30);
        human.setSecondName("Петров");
    }

    @Test
    public void getSecondName() {
        Human human = new Human("Петя", "Иванов", "Петявич", 30);
        assertEquals("Иванов", human.getSecondName());
    }

    @Test
    public void setLastName() {
        Human human = new Human("Петя", "Иванов", "Петявич", 30);
        human.setLastName("Викторович");
    }

    @Test
    public void getLastName() {
        Human human = new Human("Петя", "Иванов", "Петявич", 30);
        assertEquals("Петяевич", human.getLastName());
    }

    @Test
    public void setAge() {
        Human human = new Human("Петя", "Иванов", "Петявич", 30);
        human.setAge(55);
    }

    @Test
    public void getAge() {
        Human human = new Human("Петя", "Иванов", "Петявич", 30);
        assertEquals(30, human.getAge());
    }
}