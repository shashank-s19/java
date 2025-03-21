public class NetBankingAppRunner {
    public static void main(String[] args) {
        System.out.println(NetBankingApp.signUp("Shashank", "B S", "9876543210", "15-08-1996", "shashank@mail.com", "Male", "MG Road, Bangalore", "Bangalore", "123456789012", "SBIN0001234", "State Bank of India", "123456789012", "ABCDE1234F", "SecurePass123", "1234"));
        System.out.println(NetBankingApp.signUp("Amit", "Verma", "8765432109", "25-12-1990", "amit@mail.com", "Male", "T Nagar, Chennai", "Chennai", "987654321098", "HDFC0005678", "HDFC Bank", "234567890123", "XYZDE5678K", "StrongPass456", "5678"));
        System.out.println(NetBankingApp.signUp("Priya", "Sharma", "9988776655", "05-06-1995", "priya@mail.com", "Female", "Andheri, Mumbai", "Mumbai", "112233445566", "ICIC0007890", "ICICI Bank", "345678901234", "LMNOP1234Z", "DataPro789", "7890"));
    }
}
