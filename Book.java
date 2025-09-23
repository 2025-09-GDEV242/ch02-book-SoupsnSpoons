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
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    //Adding in int bookPages in accordance with exercise 2.85 and String refNumber in accordance with exercise 2.88
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
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
    public int borrowed()
    {
        return borrowed;
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
    /**
     * Currently left off at exercise 2.90. Not totally sure how to complete this section.
     */
    public void setRefNumber(String ref)//in accordance with exercise 2.88
    {//come back to this... exercise 2.89
        refNumber = ref;
        if (ref.length()>=3){
            refNumber = ref;
        }
        else{
            refNumber = "The ref number is too short. Please input a value that is at least 3 characters long.";
        }
    }
    public void borrow()
    {
        borrowed++;//something is wrong here...we think... HOWEVER, in theory, this should mean that the amount of books borrowed will go up by 1
    }
    /**
     * SO here's the tea, right? The code is working, but here's the problem:
     * when the code runs, regardless of what is put into the refNumber slot, it will print "Reference Number: null"
     * the if/else statement ONLY seems to come into play once you go to actually set the value for the reference number.
     * if you go to set the value and leave it as a zero length string, it will print "ZZZ" as intended, or if you put in an actual value 
     * it will print said value. I do not know if this is correct or not...
     * 
     * EDIT: so we went back and removed the refNumber from the parameters in the contructor, and added a length statement to the setter, and the issue is still there.
     * Let's try moving the conditional statement into the printDetails() section and see what happens... fingers crossed...
     */
    public void printDetails() //completing exercise 2.87...2.89
    {
       System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference number: " + refNumber);
       System.out.println("Books borrowed: " + borrowed);
       //what's happening when we run this is that it's not providing a value for the refNumber upon the code initially being run. Once you go to set the refNumber, then it will follow the directions provided in the setRefNumber section. 
    
       /*if (refNumber == ""){
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference number: ZZZ ");
        }
        else{
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference number: " + refNumber);
        }*/
    }
    
}
