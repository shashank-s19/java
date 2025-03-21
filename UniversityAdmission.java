class UniversityAdmission {
    
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String city, String courseName, String previousEducation, String guardianName, String nationality, String password) {
        String ref = null;
        boolean userIsValid = validateUserProfile(firstName, lastName, phoneNo, dob, email, gender, address, city, courseName, previousEducation, guardianName, nationality, password);
        
        if (userIsValid) {
            ref = "UniversityAdmission: Application Submitted Successfully!";
        } else {
       	   ref = "UniversityAdmission: Application Failed! Please check your details.";
        }
        
        return ref;
    }
    
    public static void signIn(String email, String password) {
        System.out.println("Applicant signed in successfully with Email: " + email);
    }
    
    @SuppressWarnings("null")
    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String city, String courseName, String previousEducation, String guardianName, String nationality, String password) {
        boolean isValid = true;
        
        if (firstName == null && firstName.length() < 3) {
            isValid = false;
        }
        
        if (lastName == null && lastName.length() < 1) {
            isValid = false;
        }
        
        if (phoneNo == null &&  phoneNo.length() != 10) {
            isValid = false;
        }
        
        if (dob == null) {
            isValid = false;
        }
        
        if (email == null && !email.contains("@")) {
            isValid = false;
        }
        
        if (gender == null && (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other"))) {
            isValid = false;
        }
        
        if (address == null && address.length() < 5) {
            isValid = false;
        }
        
        if (city == null || city.length() < 3) {
            isValid = false;
        }
        
        if (courseName == null || courseName.length() < 3) {
            isValid = false;
        }
        
        if (previousEducation == null || previousEducation.length() < 3) {
            isValid = false;
        }
        
        if (guardianName == null || guardianName.length() < 3) {
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

