package chatgptPractice.Wildcard.WildPractice1;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Generic Book"));
        books.add(new ScienceBook("Physics for Beginners", "Physics"));

        List<ScienceBook> scienceBooks = new ArrayList<>();
        scienceBooks.add( new ScienceBook("Advance Chemistry" , " Chemistry"));

        //Unbounded wildcard
        printBooks(books);
        printBooks(scienceBooks);

        // Upper-bounded wildcard
        processBooks(scienceBooks);

        // Lower-bounded wildcard
        addScienceBook(books, new ScienceBook("Biology Basics", "Biology"));
    }


        //Unbounded wildcard
        static void printBooks(List<?> books){
            System.out.println("\nPrinting books:");
            for (Object book : books){
                System.out.println(book);
            }
        }
        // Upper-bounded wildcard
        static void processBooks(List<? extends Book> books) {
            System.out.println("\nProcessing books:");
            for (Book book : books) {
                System.out.println("Processing: " + book.getTitle());
            }
        }
        // Lower-bounded wildcard
        static void addScienceBook(List<? super ScienceBook> books, ScienceBook book) {
            books.add(book);
            System.out.println("\nAdded a new ScienceBook: " + book);
    }
}
