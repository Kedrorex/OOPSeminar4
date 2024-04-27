import java.util.ArrayList;

public class Library <T extends Book>{
    ArrayList<T> library = new ArrayList<>();
    ArrayList<T> issued = new ArrayList<>();
    private int summBookLibrary = library.size();
    private int summBookIssued = issued.size();
    public void addBookOfLibrary(T book){
        library.add(book);
        System.out.println("Книга добавлена в библиотеку");
    }
    public void bookIssuance(T book){
        library.remove(book);
        issued.add(book);
        System.out.println("Книга выдана");
    }

    public void returnOfTheBook(T book){
        issued.remove(book);
        library.add(book);
        System.out.println("Книга возвращена в библиотеку");
    }

    public void libraryInfo(){
        System.out.println("Книг  в библиотеке: " + summBookLibrary + " шт");
        for(T book : library){
            System.out.println(book.GetNameBook());
        }
        System.out.println("Книг  выдано: " + summBookLibrary + " шт");
        for(T book : issued){
            System.out.println(book.GetNameBook());
        }
    }
}
