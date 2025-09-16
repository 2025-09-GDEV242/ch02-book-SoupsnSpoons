/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Arielle Bowie)
 * @version (09/15/2025)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    /**
     * Adding the two accessor methods (completing exercise 2.83)
     */
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    /**
     * Adding printAuthor and printTitle (completing exercise 2.84)
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
}
