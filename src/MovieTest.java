import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void setDirector() {
        Movie movie = new Movie("Иванищев", "Зеленый слоник", 180);
        movie.setDirector("Петрищев");
    }

    @Test
    public void setTitle() {
        Movie movie = new Movie("Иванищев", "Зеленый слоник", 180);
        movie.setTitle("Горбатая гора");
    }

    @Test
    public void setDuration() {
        Movie movie = new Movie("Иванищев", "Зеленый слоник", 180);
        movie.setDuration(100);
    }

    @Test
    public void getDirector() {
        Movie movie = new Movie("Иванищев", "Зеленый слоник", 180);
        assertEquals("Иванищев", movie.getDirector());
    }


    @Test
    public void getTitle() {
        Movie movie = new Movie("Иванищев", "Зеленый слоник", 180);
        assertEquals("Зеленый слоник", movie.getTitle());
    }
}