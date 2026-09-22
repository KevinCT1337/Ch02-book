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

    /**
     * Set the author and title fields when this object
     * is constructed.
     * 
     * 
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
                ", Reference Number: ZZZ"
            );
        }
        else
        {
            System.out.println(
                "Title: " + title + 
                ", Author: " + author +
                ", Pages: " + pages +
                ", Reference Number: " + refNumber
            );
        }
    }
    
    
    /*
     * setRefNumber setter method
     * 
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
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
    
    
}
