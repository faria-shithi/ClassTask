class Books {
    public int bookId;
    public String bookName, bookAuthor, yearOfPub;
    public float price;
    public String status;

    public Books(int bookId, String bookName, String bookAuthor, String yearOfPub, float price, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }
    public void addNewBooks() {
        System.out.println("book added " + bookName);
    }

    public void deleteBooks() {
        System.out.println("book deleted " + bookName);
    }

    public void displayBookDetails() {
        System.out.println("ID " + bookId + " title: " + bookName
                + " author: " + bookAuthor + "  year: " + yearOfPub
                + " | price " + price + "  status " + status);
    }

    public void inquiryBook() {
        System.out.println("inquiry  " + bookName );
    }
}
class Librarian {
    public int id;
    public String name;

    public Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void searchBook(String name) {
        System.out.println(this.name + " is searching book" + name);
    }
    public boolean verifyMember(int id) {
        System.out.println("Verifying ID " + id);
        return true; 
    }
    public void orderBooks() {
        System.out.println(name + "ordered");
    }

    public void sellBooks() {
        System.out.println(name + " is selling");
    }
}
class User {
    public int userID;
    public String userName,userAddress;
    public int phoneNo;

    public User(int userID, String userName, String userAddress, int phoneNo) {
        this.userID = userID;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }
    public void returnBooks() {
        System.out.println(userName + " returned a book");
    }
    public int payFine(String date) {
        System.out.println(userName + " paid fine on " + date);
        return 0;
    }

    public void addNewUser() {
        System.out.println("new user added " + userName);
    }

    public void deleteUser() {
        System.out.println("user deleted " + userName);
    }

    public void updateDetails() {
        System.out.println("details for " + userName);
    }

    public void bookPurchase() {
        System.out.println(userName + " purchased a book.");
    }
}
class Publisher {
    public int id;
    public String name, address;
    public int phoneNo;

    public Publisher(int id, String name, String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void addPub() {
        System.out.println("publisher added " + name);
    }

    public void modifyPub() {
        System.out.println("publisher modified " + name);
    }

    public void deletePub() {
        System.out.println("publisher deleted " + name);
    }

    public void orderStatus() {
        System.out.println("Order status checked  " + name);
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Books book = new Books(1, "harry potter", "J.k Rowling", "2001", 466.0f, "Available");
        book.displayBookDetails();
        book.inquiryBook();
     Librarian lib = new Librarian(101, "luna");
        lib.searchBook("harry potter");
        lib.verifyMember(5);
        User user = new User(9, "ron", "bailey", 98348701);
        user.bookPurchase();
        user.returnBooks();
        Publisher publisher = new Publisher(592, "O jonson", "Beacon,NY", 34732874);
        publisher.addPub();
        publisher.orderStatus();
    }
}
