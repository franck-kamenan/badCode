package be.intecbrussel.lamdatest.model;

public class Book
{
    private String title;
    private Person author;
    private String genre;

    public Book(String myTitle, Person myAuthor, String myGenre)
    {
        this.title = myTitle;
        this.author = myAuthor;
        this.genre = myGenre;
    }

    public String getTitle()
    {
        return title;
    }

    public Person getAuthor()
    {
        return author;
    }

    public String getGenre()
    {
        return genre;
    }
}
