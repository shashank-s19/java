class PanCardRegistration {
    
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String city, String aadharNumber, String fatherName, String incomeSource, String nationality, String password) {
        String ref = null;
        boolean userIsValid = validateUserProfile(firstName, lastName, phoneNo, dob, email, gender, address, city, aadharNumber, fatherName, incomeSource, nationality, password);
        
        if (userIsValid) {
            ref = "PanCardRegistration: User Signup Successful!";
        } else {
            ref = "PanCardRegistration: Signup Failed! Please check your details.";
        }
        
        return ref;
    }
    
    public static void signIn(String email, String password) {
        System.out.println("User signed in successfully with Email: " + email);
    }
    
    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String city, String aadharNumber, String fatherName, String incomeSource, String nationality, String password) {
        boolean isValid = true;
        
        if (firstName == null || firstName.length() < 3) {
            isValid = false;
        }
        
        if (lastName == null || lastName.length() < 1) {
            isValid = false;
        }
        
        if (phoneNo == null || phoneNo.length() != 10) {
            isValid = false;
        }
        
        if (dob == null) {
            isValid = false;
        }
        
        if (email == null || !email.contains("@")) {
            isValid = false;
        }
        
        if (gender == null || (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other"))) {
            isValid = false;
        }
        
        if (address == null || address.length() < 5) {
            isValid = false;
        }
        
        if (city == null || city.length() < 3) {
            isValid = false;
        }
        
        if (aadharNumber == null || aadharNumber.length() != 12) {
            isValid = false;
        }
        
        if (fatherName == null || fatherName.length() < 3) {
            isValid = false;
        }
        
        if (incomeSource == null || (!incomeSource.equalsIgnoreCase("Salary") && !incomeSource.equalsIgnoreCase("Business") && !incomeSource.equalsIgnoreCase("Others"))) {
            isValid = false;
        }
        
        if (nationality == null || !nationality.equalsIgnoreCase("Indian")) {
            isValid = false;
        }
        
        if (password == null || password.length() < 6) {
            isValid = false;
        }
        
        return isValid;
    }
}


