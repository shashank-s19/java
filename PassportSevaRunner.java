public class PassportSevaRunner {
    public static void main(String[] args) {
        System.out.println(PassportSeva.signUp("Shashank", "B S", "9876543210", "15-08-1996", "shashank@mail.com", "Male", "MG Road, Bangalore", "Indian", "Ordinary", "123456789012", "Bangalore", "Single", "Employed", "9876543211"));
        System.out.println(PassportSeva.signUp("Amit", "Verma", "8765432109", "25-12-1990", "amit@mail.com", "Male", "T Nagar, Chennai", "Indian", "Diplomatic", "234567890123", "Chennai", "Married", "Unemployed", "8765432108"));
        System.out.println(PassportSeva.signUp("Priya", "Sharma", "9988776655", "05-06-1995", "priya@mail.com", "Female", "Andheri, Mumbai", "Indian", "Official", "345678901234", "Mumbai", "Single", "Student", "9988776654"));
    }
}
