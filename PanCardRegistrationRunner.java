public class PanCardRegistrationRunner {
    public static void main(String[] args) {
        System.out.println(PanCardRegistration.signUp("Shashank", "B S", "9876543210", "15-08-1996", "shashank@mail.com", "Male", "MG Road, Bangalore", "Bangalore", "123456789012", "Rajesh B S", "Salary", "Indian", "SecurePass123"));
        System.out.println(PanCardRegistration.signUp("Amit", "Verma", "8765432109", "25-12-1990", "amit@mail.com", "Male", "T Nagar, Chennai", "Chennai", "234567890123", "Suresh Verma", "Business", "Indian", "StrongPass456"));
        System.out.println(PanCardRegistration.signUp("Priya", "Sharma", "9988776655", "05-06-1995", "priya@mail.com", "Female", "Andheri, Mumbai", "Mumbai", "345678901234", "Rakesh Sharma", "Others", "Indian", "DataPro789"));
    }
}