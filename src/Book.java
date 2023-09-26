public class Book extends Item {
    private String isbn_number;
    private String author;
    Book(){

    }
    Book(String title, String isbn_number, String author){
        super(title);
        this.isbn_number = isbn_number;
        this.author = author;
    }
    public String getIsbn_number(){
        return isbn_number;
    }
    public void setIsbn_number(String isbn_number){
        this.isbn_number = isbn_number;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getListing(){
        return "Book name: " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nISBN#: " + getIsbn_number();
    }
}
