class LinkedInApp {
    
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String city, String profession, String experience, String skills, String education, String linkedInProfile, String password) {
        String ref = null;
        boolean userIsValid = validateUserProfile(firstName, lastName, phoneNo, dob, email, gender, address, city, profession, experience, skills, education, linkedInProfile, password);
        
        if (userIsValid) {
            ref = "LinkedInApp: User Signup Successful!";
        } else {
            ref = "LinkedInApp: Signup Failed! Please check your details.";
        }
         
        return ref
    }
    
    public static void signIn(String email, String password) {
        System.out.println("User signed in successfully with Email: " + email);
    }
    
    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String city, String profession, String experience, String skills, String education, String linkedInProfile, String password) {
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
        
        if (profession == null || profession.length() < 3) {
            isValid = false;
        }
        
        if (experience == null || experience.length() < 1) {
            isValid = false;
        }
        
        if (skills == null || skills.length() < 3) {
            isValid = false;
        }
        
        if (education == null || education.length() < 3) {
            isValid = false;
        }
        
        if (linkedInProfile == null || !linkedInProfile.startsWith("https://www.linkedin.com/in/")) {
            isValid = false;
        }
        
        if (password == null || password.length() < 6) {
            isValid = false;
        }
        
        return isValid;
    }
}


