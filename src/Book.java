public class Book {
    String name;
    String autor;
    int pages;
    int yearOfIssued;

    Book(String name, String autor, int pages, int yearOfIssued) {
        this.name = name;
        this.autor = autor;
        this.pages = pages;
        this.yearOfIssued = yearOfIssued;
    }

    void setName(String name) {
        this.name = name;

    }

    String getName() {
        return name;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    String getAutor() {
        return autor;
    }

    void setPages(int pages) {
        this.pages = pages;
    }

    int getPages() {
        return pages;
    }

    void setYearOfIssued(int yearOfIssued) {
        this.yearOfIssued = yearOfIssued;

    }

    int getYearOfIssued() {
        return yearOfIssued;
    }
}
