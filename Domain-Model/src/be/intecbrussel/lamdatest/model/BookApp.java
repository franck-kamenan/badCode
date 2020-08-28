package be.intecbrussel.lamdatest.model;

public class BookApp
{
    public static void main(String[] args)
    {
        Person author1 = new Person("Steve", "King");
        Person author2 = new Person("Akira", "Toriama");
        Person author3 = new Person("Eichiro", "Oda");
        Person author4 = new Person("One", "Two");
        Person author5 = new Person("Tite", "Kubo");

        Book book1 = new Book("It", author1, "horror");
        Book book2 = new Book("Dragon Ball", author2, "action");
        Book book3 = new Book("One Piece", author3, "action");
        Book book4 = new Book("One Punch Man", author4, "comedy");
        Book book5 = new Book("Bleach", author5, "action");

        Book[] books = {book1, book2, book3, book4, book5};

        public static Book getNewestBook(Book[] books)
        {
            return ;
        }
        public static void printYoungestWriter(Book[] books)
        {
            System.out.println("");
        }
        public static void printSortedByTitle(Book[] books)
        {
            System.out.println("");
        }
        public static void countBooksPerAuthor(Book[] books)
        {
            System.out.println("");
        }
        public static void printBooksReleasedIn2006(Book[] books)
        {
            System.out.println("");
        }


    }
}
