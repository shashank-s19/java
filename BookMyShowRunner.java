public class BookMyShowRunner {
    public static void main(String[] args) {
        System.out.println(BookMyShow.signUp("Alice", "Brown", "9876543210", "02-02-1995", "alice@mail.com", "Female", "New York", "English", "Credit Card", "Premium", "Action"));
        System.out.println(BookMyShow.signUp("Bob", "Smith", "8765432109", "10-10-1992", "bob@mail.com", "Male", "Los Angeles", "Spanish", "UPI", "Standard", "Comedy"));
    }
}
