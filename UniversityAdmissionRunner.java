public class UniversityAdmissionRunner {
    public static void main(String[] args) {
        System.out.println(UniversityAdmission.signUp("Rahul", "Mishra", "9876543210", "10-07-2004", "rahul.mishra@mail.com", "Male", "Sector 21, Noida", "Noida", "Computer Science", "12th Grade", "Anil Mishra", "Indian", "Pass1234"));
        System.out.println(UniversityAdmission.signUp("Sonia", "Gupta", "8765432109", "25-11-2003", "sonia.gupta@mail.com", "Female", "MG Road, Pune", "Pune", "Mechanical Engineering", "12th Grade", "Rajesh Gupta", "Indian", "SecurePass789"));
        System.out.println(UniversityAdmission.signUp("Vikram", "Singh", "9988776655", "15-05-2005", "vikram.singh@mail.com", "Male", "JP Nagar, Hyderabad", "Hyderabad", "Electronics & Communication", "12th Grade", "Suresh Singh", "Indian", "StrongPass456"));
    }
}