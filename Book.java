/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Kevin Cox-Torrelio
 * @version 9/21/26
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
     * Set the author, title, pages, and courseText fields when this object
     * is constructed.
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
     * getAuthor getter method that gets the author
     * 
     * @return the name of the author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /*
     * getTitle getter method that gets the title
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
     * Prints out to the terminal the author name
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /*
     * printTitle method
     * 
     * Prints out to the terminal the title name
     * 
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /*
     * getPages getter method that gets the number of pages
     * 
     * @return the number of pages
     */
    public int getPages(){
        return pages;
    }
    
    /*
     * printDetails method that prints out details about the book
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
                ", Times this book was borrowed: " + borrowed + 
                ", Is for a course?: " + courseText
            );
        }
        else
        {
            System.out.println(
                "Title: " + title + 
                ", Author: " + author +
                ", Pages: " + pages +
                ", Reference Number: " + refNumber +
                ", Times this book was borrowed: " + borrowed + 
                ", Is for a course?: " + courseText
            );
        }
    }
    
    
    /*
     * setRefNumber setter method that sets a reference number, and
     * error if it is too short
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
     * getRefNumber getter method that returns the reference number
     * 
     * @return the reference number text
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /*
     * borrow mutator method that increments the borrowed field
     * 
     */
    public void borrow()
    {
        borrowed += 1;
    }
    
    /*
     * getBorrowed getter method that returns the number of times borrowed
     * 
     * @return the number of times borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /*
     * isCourseText accessor method that returns the final state on whether
     * the book is for a course or not
     * 
     * @return the state if the book is for a course
     */
    public boolean isCourseText()
    {
        return courseText;    
    }
    
}
