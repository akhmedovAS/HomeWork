import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void setName() {
         Book book = new Book("Антошка","Иванов",300,2000);
         book.setName("Картошка");
    }

    @Test
    public void getName() {
        Book book = new Book("Антошка","Иванов",300,2000);
        assertEquals("Антошка",book.getName());
    }

    @Test
    public void setAutor() {
        Book book = new Book("Антошка","Иванов",300,2000);
        book.setAutor("Петров");
    }

    @Test
    public void getAutor() {
        Book book = new Book("Антошка","Иванов",300,2000);
        assertEquals("Иванов",book.getAutor());
    }

    @Test
    public void setPages() {
        Book book = new Book("Антошка","Иванов",300,2000);
        book.setPages(1999);
    }

    @Test
    public void getPages() {
        Book book = new Book("Антошка","Иванов",300,2000);
        assertEquals(2000, book.getPages());
    }

    @Test
    public void setYearOfIssued() {
        Book book = new Book("Антошка","Иванов",300,2000);
        book.setYearOfIssued(2001);
    }

    @Test
    public void getYearOfIssued() {
        Book book = new Book("Антошка","Иванов",300,2000);
        assertEquals(2000,book.getYearOfIssued());
    }
}