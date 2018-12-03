package th2allotherclasses;

/**
 *
 * @author emanuela
 */
public class Book {

    String title;
    Genre genre;

    public Book(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }
}
