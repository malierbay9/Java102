package book_sorter;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> bookSet = new TreeSet<>();

        bookSet.add(new Book("Cin Ali",10,"",5));
        bookSet.add(new Book("Sefiller",621,"Victor hugo",2));
        bookSet.add(new Book("Suç ve Ceza",793,"Dostoyevski",1));
        bookSet.add(new Book("Kırmızı ve Siyah",732,"Stendhal",3));
        bookSet.add(new Book("Uğultulu Tepeler",462,"Emily Bronte",4));

        TreeSet<Book> bookSet2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        }.reversed());

        bookSet2.add(new Book("Cin Ali",10,"",5));
        bookSet2.add(new Book("Sefiller",621,"Victor hugo",2));
        bookSet2.add(new Book("Suç ve Ceza",793,"Dostoyevski",1));
        bookSet2.add(new Book("Kırmızı ve Siyah",732,"Stendhal",3));
        bookSet2.add(new Book("Uğultulu Tepeler",462,"Emily Bronte",4));

        Iterator<Book> itr = bookSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getName());
        }

        System.out.println("***************************");

        Iterator<Book> itr2 = bookSet2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next().getName());
        }
    }
}
