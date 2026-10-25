public class lesson19 {
    
    public static void main(String[] args){

        Book Harry = new Book();
        Harry.setBook("harryP", "gleb", 5);
        System.out.println(Harry.getBook());
        Book mcdack = new Book();
    }



static class Book {   
    String title;
    String author;
    int pages; 

    void setBook(String title,String author,int pages)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    String getBook()
    {
        return "name of book = " + title + " \nauthor = " + author + " \npages = " + pages;
    }


}
}
