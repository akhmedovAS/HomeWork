/**
 * Класс, описывающий книгу
 */
public class Book {
    String name;
    String autor;
    int pages;
    int yearOfIssued;

    /**
     * Конструктор класса
     * @param name Название книги
     * @param autor Имя писателя
     * @param pages кол-во страниц
     * @param yearOfIssued год выпуска книги
     */
    Book(String name, String autor, int pages, int yearOfIssued) {
        this.name = name;
        this.autor = autor;
        this.pages = pages;
        this.yearOfIssued = yearOfIssued;
    }

    /**
     *
     * Установить название
     */
    void setName(String name) {
        this.name = name;

    }

    /**
     *
     * Получить название
     */
    String getName() {
        return name;
    }

    /**
     *
     * Установить имя писателя
     */
    void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     *
     * получить имя писателя
     */
    String getAutor() {
        return autor;
    }

    /**
     *
     * установить кол-во страниц
     */
    void setPages(int pages) {
        this.pages = pages;
    }

    /**
     *
     * получить кол-во страниц
     */
    int getPages() {
        return pages;
    }

    /**
     *
     * установить год выпуска
     */
    void setYearOfIssued(int yearOfIssued) {
        this.yearOfIssued = yearOfIssued;

    }

    /**
     *
     * Получить год выпуска
     */
    int getYearOfIssued() {
        return yearOfIssued;
    }
}
