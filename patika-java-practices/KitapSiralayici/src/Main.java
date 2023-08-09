import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("A", 100, "A", "A", 2000, 1, 10, 1);
        Book book2 = new Book("B", 100, "B", "B", 2000, 1, 10, 2);
        Book book3 = new Book("C", 100, "C", "C", 2000, 1, 10, 3);
        Book book4 = new Book("D", 100, "D", "D", 2000, 1, 10, 4);
        Book book5 = new Book("E", 100, "E", "E", 2000, 1, 10, 5);
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        System.out.println(bookSet);
        Set<Book> bookSet2 = new HashSet<>();
        bookSet2.add(book1);
        bookSet2.add(book2);
        bookSet2.add(book3);
        bookSet2.add(book4);
        bookSet2.add(book5);

        Comparator<Book> comparator = Comparator
        .comparing(Book::getPageNumber);
        bookSet2.stream().sorted(comparator).forEach(System.out::println);
    }
}