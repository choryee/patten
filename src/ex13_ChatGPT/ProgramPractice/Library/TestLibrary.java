package ex13_ChatGPT.ProgramPractice.Library;

import java.util.HashMap;
import java.util.Map;

public class TestLibrary {
    public static void main(String[] args) {
        BookSystem bookSystem=new BookSystem();

        Map<BookType, Book> bookMap1=new HashMap<>();
        bookMap1.put(BookType.NOVEL, new Book("Gone with wind", 5));
        bookMap1.put(BookType.SCIENCE, new Book("Cosmos", 7));

        bookSystem.addList(bookMap1);
        bookSystem.show();
        System.out.println(bookMap1.get(BookType.SCIENCE));
        System.out.println(bookSystem.getKey());



        BookUser bookUser1=new BookUser("John", 4, BookType.NOVEL);
        //BookUser bookUser2=new BookUser("lee", 4, BookType.SOCIAL);
        bookUser1.notifyReturnDay();
        bookUser1.rented(bookSystem);




    }
}
