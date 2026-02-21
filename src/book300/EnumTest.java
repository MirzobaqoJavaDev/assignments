package book300;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {

        Book[] book = Book.values();
        System.out.println(Arrays.toString(book));


        // print all books in enum Book
//        for (Book book: Book.values())
//            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(),
//                    book.getCopyrightYear());
//
//        System.out.printf("%nDisplay a range of enum constants: %n");
//
//        // print first four books
//        for (Book book: EnumSet.range(Book.JHTP, Book.CHTP))
//            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(),
//                    book.getCopyrightYear());
    }
}
