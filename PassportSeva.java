class PassportSeva{
    
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String nationality, String passportType, String aadharNumber, String birthPlace, String maritalStatus, String employmentType, String emergencyContact) {
        String ref = null;
        boolean userIsValid = validateUserProfile(firstName, lastName, phoneNo, dob, email, gender, address, nationality, passportType, aadharNumber, birthPlace, maritalStatus, employmentType, emergencyContact);
        
        if (userIsValid) {
            ref = "PassportSeva: User Signup Successful!";
        } else {
            ref = "PassportSeva: Signup Failed! Please check your details.";
        }
        
        return ref;
    }
    
    public static void signIn(String email, String aadharNumber) {
        System.out.println("User signed in successfully with Aadhar Number: " + aadharNumber);
    }
    
    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String nationality, String passportType, String aadharNumber, String birthPlace, String maritalStatus, String employmentType, String emergencyContact) {
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
        
        if (nationality == null || !nationality.equalsIgnoreCase("Indian")) {
            isValid = false;
        }
        
        if (passportType == null || (!passportType.equalsIgnoreCase("Ordinary") && !passportType.equalsIgnoreCase("Diplomatic") && !passportType.equalsIgnoreCase("Official"))) {
            isValid = false;
        }
        
        if (aadharNumber == null || aadharNumber.length() != 12) {
            isValid = false;
        }
        
        if (birthPlace == null || birthPlace.length() < 3) {
            isValid = false;
        }
        
        if (maritalStatus == null || (!maritalStatus.equalsIgnoreCase("Single") && !maritalStatus.equalsIgnoreCase("Married") && !maritalStatus.equalsIgnoreCase("Divorced"))) {
            isValid = false;
        }
        
        if (employmentType == null || (!employmentType.equalsIgnoreCase("Employed") && !employmentType.equalsIgnoreCase("Unemployed") && !employmentType.equalsIgnoreCase("Student"))) {
            isValid = false;
        }
        
        if (emergencyContact == null || emergencyContact.length() != 10) {
            isValid = false;
        }
        
        return isValid;
    }
}

