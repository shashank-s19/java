class FoodDelivery{
    
    
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String password, String address, String preferredCuisine) {
        String ref = null;
        boolean userIsValid = validateUserProfile(firstName, lastName, phoneNo, dob, email, gender, password, address, preferredCuisine);
        
        if (userIsValid) {
            ref = "FoodDelivery: User Signup Successful!";
        } else {
            ref = "FoodDelivery: Signup Failed! Please check your details.";
        }
        
        return ref;
    }
    
   
    public static void signIn(String email, String password) {
        System.out.println("User signed in successfully with email: " + email);
    }
    
   
    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String password, String address, String preferredCuisine) {
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
        
        if (password == null || password.length() < 6) {
            isValid = false;
        }
        
        if (address == null || address.length() < 5) {
            isValid = false;
        }
        
        if (preferredCuisine == null || preferredCuisine.length() < 3) {
            isValid = false;
        }
        
        return isValid;
    }
}