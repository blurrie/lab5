import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] myCollection = new Item[5];
       for (int i = 0; i < myCollection.length; i++){
           System.out.println("Please enter B for Book or P for Periodical");
           if (sc.nextLine().equalsIgnoreCase("B")){
               System.out.println("Please enter the title");
               String bookTitle = sc.nextLine();
               System.out.println("Please enter the author");
               String bookAuthor = sc.nextLine();
               System.out.println("Please enter the ISBN number");
               String bookISBN = sc.nextLine();
                //here, random extra input ?????
               Item book = new Book(bookTitle,bookAuthor,bookISBN);

               myCollection[i] = book;
           }
           if (sc.nextLine().equalsIgnoreCase("P")){
               //here, random extra input ?????
               System.out.println("Please enter the title");
               String pTitle = sc.nextLine();
               System.out.println("Please enter the issue number");
               String pIssue = sc.nextLine();

               Item periodical = new Periodical(pIssue,pTitle);

               myCollection[i] = periodical;
           }
       }

        for (Item item : myCollection) {
            System.out.println(item);
        }
    }
}