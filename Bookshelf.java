package th2allotherclasses;

/**
 *
 * @author emanuela
 */
public class Bookshelf {

    Book[] books = new Book[10];

    public void addBookToBookshelf(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                i = books.length;
            }
        }
    }

    public Book retrieveBookFromBookshelf(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                Book retrievedBook = books[i];
                books[i] = null;
                return retrievedBook;
            } else {
                System.out.println("No books found with that title");
            }
        }
        return null;
    }

    public void displayBooks() {
        String Display = "Displaying bookshelf: ";
        Boolean isEmpty = true;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                Display += books[i].getTitle() + ", ";
                isEmpty = false;
            }
        }
        if (isEmpty == true) {
            Display += " The bookshelf is empty.";
        }
        System.out.print(Display + "\n");
    }

    public int howManyBooks() {
        int booksOnShelf = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                booksOnShelf++;
            }
        }
        return booksOnShelf;
    }
}
