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
    private String refNumber;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    //Adding in int bookPages in accordance with exercise 2.85 and String refNumber in accordance with exercise 2.88
    public Book(String bookAuthor, String bookTitle, String refNumber, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // Add the methods here ...
    /**
     * Adding the accessor methods (completing exercise 2.83...2.85...2.88)
     */
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public int getPages()
    {
        return pages;
    }
    public String refNumber()
    {
        return refNumber;
    }
    /**
     * Adding printAuthor and printTitle (completing exercise 2.84...2.87...2.88)
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
    public void setRefNumber(String ref)//in accordance with exercise 2.88
    {//come back to this... exercise 2.89
        refNumber = ref;
    }
    /**
     * SO here's the tea, right? The code is working, but here's the problem:
     * when the code runs, regardless of what is put into the refNumber slot, it will print "Reference Number: null"
     * the if/else statement ONLY seems to come into play once you go to actually set the value for the reference number.
     * if you go to set the value and leave it as a zero length string, it will print "ZZZ" as intended, or if you put in an actual value, it will print said value.
     * I do not know if this is correct or not...
     */
    public void printDetails() //completing exercise 2.87...2.89
    {
        if (refNumber == ""){
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference number: ZZZ ");
        }
        else{
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference number: " + refNumber);
        }
    }
    
}
