class Lib { 
    static int totalBooks = 0;
    String userName;
    Lib(String userName) {
        this.userName = userName;

    }
    void issueBook(String bookName) {
        totalBooks++;
        System.out.println(userName + " issued: " + bookName);

    }
}
public class Library {
    public static void main(String[] args) {
         Lib user1 = new Lib("A");
        Lib user2 = new Lib("B");
         user1.issueBook("math");
        user1.issueBook("english");
        user2.issueBook("science");

        System.out.println("Total Books Issued: " + Lib.totalBooks);
   
    }

}



















/*
//single class
public class Library {
     static int totalBooks = 0;
    String userName;
  Library(String userName) {
        this.userName = userName;
    }
void issueBook(String bookName) {
        totalBooks++;
        System.out.println(userName + " issued: " + bookName);
}

    public static void main(String[] args) {
    
        Library user1 = new Library("Alice");
        Library user2 = new Library("Bob");
        user1.issueBook("Java");
        user1.issueBook("Python");
        user2.issueBook("DBMS");
        System.out.println("Total Books Issued: " + totalBooks);
    }
}
*/