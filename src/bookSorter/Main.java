package bookSorter;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
        Book book1 =new Book("Ali Baba ve Yedi Cüceler",165,"Eren Kahveci","1986");
        Book book3 =new Book("Karanlık Rüya",765,"Selen Kahveci","1985");
        Book book2 =new Book("Pembe Otobüs",865,"Kerem Kahveci","1984");
        Book book4 =new Book("Kırmızı Başlıklı Kurt",665,"Şamil Kahveci","1983");
        Book book5 =new Book("Tilki ile Karga",265,"Kamil Kahveci","1982");

        Set<Book> bookSet = new TreeSet<>(Book::compareToPageNumber);
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        Iterator iterator =bookSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
