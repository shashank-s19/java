class Max {

    // Purpose
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String mailId, String gender) {
        String ref=null;

        boolean userIsValidate = validateUserProfile(firstName, lastName, phoneNo, dob, mailId, gender);
        if (userIsValidate) {
            ref = "User Signup Successful";
        } else {
            ref = "User Signup Unsuccess";
			
        }

        return ref;	
    }

    public static void signIn(long phoneNumber) {
        System.out.println("User signed in with phone number: " + phoneNumber);
    }

    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String mailId, String gender) {
        boolean userValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNoValid = false;
        boolean isDobValid = false;
        boolean isMailIdValid = false;
        boolean isGenderValid = false;

        if (firstName != null && firstName.length() >= 3) {
            isFirstNameValid = true;
        } else {
            System.out.println("Firstname Invalid. Please provide a valid firstname.");
        }

        if (lastName != null && lastName.length() >= 1) {
            isLastNameValid = true;
        } else {
            System.out.println("LastName is invalid. Please provide a valid last name.");
        }

        if (phoneNo != null && phoneNo.length() == 10) {
            isPhoneNoValid = true;
        } else {
            System.out.println("PhoneNo is invalid. Please provide a valid phone number.");
        }

        if (dob != null) {
            isDobValid = true;
        } else {
            System.out.println("Date of birth is invalid. Please provide a valid date of birth.");
        }

        if (mailId != null) {
            isMailIdValid = true;
        } else {
            System.out.println("MailId is invalid. Please provide a valid email.");
        }

        if (gender != null) {
            isGenderValid = true;
        } else {
            System.out.println("Gender is invalid. Please provide a valid gender.");
        }

        if (isFirstNameValid && isLastNameValid && isDobValid && isPhoneNoValid && isGenderValid && isMailIdValid) {
            userValid = true;
        } else {
            System.out.println("Check credentials.");
        }

        return userValid;
    }
}
