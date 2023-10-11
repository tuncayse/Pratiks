import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================");

        //Set Yapısı
        TreeSet<Book> books = new TreeSet<Book>(new getOrderBookCompare());
        TreeSet<Book> booksOrderPageCount = new TreeSet<Book>(new getCompareNumber());

        books.add(new Book("Calikusu", 119,"Resat Nuri Guntekin",1922));
        books.add(new Book("Kir Cicegi Tepesi", 534,"Kimberley Freeman", 2013));
        books.add(new Book("Korluk", 56,"Jose Saramago", 199));
        books.add(new Book("Matty Doolin", 336,"Catherine Cookson",2007));
        books.add(new Book("Kucuk Prens", 96,"Antoine De Saint-Exupery",1943));

        booksOrderPageCount.addAll(books);

        //Kitaplar A'dan Z'ye sıralanır.
        for(Book book : books) {
            System.out.println(book.getName());
        }

        System.out.println("==========================");

        //Sayfa numaraları küçükten  büyüğe sıralanır.
        for(Book bookPageCount : booksOrderPageCount) {
            System.out.println(bookPageCount.getPageCount());
        }
        System.out.println("==========================");
    }
}