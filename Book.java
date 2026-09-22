/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    
    private String refNumber;
    private int borrowed;
    private final boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     * 
     * 
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookIsCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookIsCourseText;
    }

    
    /*
     * getAuthor getter method
     * 
     * @return the name of the author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /*
     * getTitle getter method
     * 
     * @return the title of the book
     */
    public String getTitle()
    {
        return title;
    }
    
    /*
     * printAuthor method
     * 
     * 
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /*
     * printTitle method
     * 
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /*
     * getPages getter method
     * 
     * @return the number of pages
     */
    public int getPages(){
        return pages;
    }
    
    /*
     * printDetails method
     * 
     * Prints book details to the terminal as a formatted string
     */
    public void printDetails(){
        if (refNumber.length() == 0){
            System.out.println(
                "Title: " + title + 
                ", Author: " + author +
                ", Pages: " + pages +
                ", Reference Number: ZZZ" +
                ", Times this book was borrowed: " + borrowed
            );
        }
        else
        {
            System.out.println(
                "Title: " + title + 
                ", Author: " + author +
                ", Pages: " + pages +
                ", Reference Number: " + refNumber +
                ", Times this book was borrowed: " + borrowed
            );
        }
    }
    
    
    /*
     * setRefNumber setter method
     * 
     */
    public void setRefNumber(String ref)
    {
        if (ref.length() < 3){
            System.out.println("ERROR: reference number must be at least 3 characters long!");
        }
        else
        {
            refNumber = ref;
        }
    }
    
    /*
     * getRefNumber getter method
     * 
     * @return the reference number text
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /*
     * borrow mutator method
     * 
     */
    public void borrow()
    {
        borrowed += 1;
    }
    
    /*
     * getBorrowed getter method
     * 
     * @return the number of times borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /*
     * isCourseText accessor method
     * 
     * @return the state if the book is for a course
     */
    public boolean isCourseText()
    {
        return courseText;    
    }
    
}
