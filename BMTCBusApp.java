class BMTCBusApp{
    
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String city, String busPassType, String aadharNumber, String preferredRoute, String emergencyContact, String paymentMethod) {
        String ref = null;
        boolean userIsValid = validateUserProfile(firstName, lastName, phoneNo, dob, email, gender, address, city, busPassType, aadharNumber, preferredRoute, emergencyContact, paymentMethod);
        
        if (userIsValid) {
            ref = "BMTCBusApp: User Signup Successful!";
        } else {
            ref = "BMTCBusApp: Signup Failed! Please check your details.";
        }
        
        return ref;
    }
    
    public static void signIn(String email, String phoneNo) {
        System.out.println("User signed in successfully with Phone Number: " + phoneNo);
    }
    
    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String city, String busPassType, String aadharNumber, String preferredRoute, String emergencyContact, String paymentMethod) {
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
        
        if (busPassType == null || (!busPassType.equalsIgnoreCase("Student") && !busPassType.equalsIgnoreCase("Regular") && !busPassType.equalsIgnoreCase("Senior Citizen"))) {
            isValid = false;
        }
        
        if (aadharNumber == null || aadharNumber.length() != 12) {
            isValid = false;
        }
        
        if (preferredRoute == null || preferredRoute.length() < 3) {
            isValid = false;
        }
        
        if (emergencyContact == null || emergencyContact.length() != 10) {
            isValid = false;
        }
        
        if (paymentMethod == null || (!paymentMethod.equalsIgnoreCase("Credit Card") && !paymentMethod.equalsIgnoreCase("Debit Card") && !paymentMethod.equalsIgnoreCase("UPI"))) {
            isValid = false;
        }
        
        return isValid;
    }
}


