import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void getAnagram() {
        Anagram anagram = new Anagram("Привет");
        assertNotEquals("Привет",anagram.getAnagram("Привет"));
    }
}