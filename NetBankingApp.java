class NetBankingApp{
    
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String city, String accountNumber, String ifscCode, String bankName, String aadharNumber, String panNumber, String password, String transactionPin) {
        String ref = null;
        boolean userIsValid = validateUserProfile(firstName, lastName, phoneNo, dob, email, gender, address, city, accountNumber, ifscCode, bankName, aadharNumber, panNumber, password, transactionPin);
        
        if (userIsValid) {
            ref = "NetBankingApp: User Signup Successful!";
        } else {
            ref = "NetBankingApp: Signup Failed! Please check your details.";
        }
        
        return ref;
    }
    
    public static void signIn(String accountNumber, String password) {
        System.out.println("User signed in successfully with Account Number: " + accountNumber);
    }
    
    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String address, String city, String accountNumber, String ifscCode, String bankName, String aadharNumber, String panNumber, String password, String transactionPin) {
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
        
        if (accountNumber == null || accountNumber.length() < 10) {
            isValid = false;
        }
        
        if (ifscCode == null || ifscCode.length() != 11) {
            isValid = false;
        }
        
        if (bankName == null || bankName.length() < 3) {
            isValid = false;
        }
        
        if (aadharNumber == null || aadharNumber.length() != 12) {
            isValid = false;
        }
        
        if (panNumber == null || panNumber.length() != 10) {
            isValid = false;
        }
        
        if (password == null || password.length() < 6) {
            isValid = false;
        }
        
        if (transactionPin == null || transactionPin.length() != 4) {
            isValid = false;
        }
        
        return isValid;
    }
}

