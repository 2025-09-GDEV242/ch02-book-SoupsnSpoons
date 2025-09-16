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
     * Adding the two accessor methods
     */
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    
}
