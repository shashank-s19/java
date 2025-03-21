class BookMyShow {
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String city, String preferredLanguage, String paymentMethod, String membershipType, String favoriteGenre) {
        String ref = null;
        boolean isValid = validateUserProfile(firstName, lastName, phoneNo, dob, email, gender, city, preferredLanguage, paymentMethod, membershipType, favoriteGenre);
        if (isValid) {
            ref = "User Signup Successful";
        } else {
            ref = "User Signup Unsuccessful";
        }
        return ref;
    }

    public static void signIn(long phoneNumber) {
        System.out.println("User signed in with phone number: " + phoneNumber);
    }

    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String city, String preferredLanguage, String paymentMethod, String membershipType, String favoriteGenre) {
        boolean UserValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNoValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isGenderValid = false;
        boolean isCityValid = false;
        boolean isPreferredLanguageValid = false;
        boolean isPaymentMethodValid = false;
        boolean isMembershipTypeValid = false;
        boolean isFavoriteGenreValid = false;
        
        if (firstName != null && firstName.length() >= 3) {
            isFirstNameValid = true;
        } else {
            System.out.println("Firstname Invalid Please Provide Valid Firstname");
        }

        if (lastName != null && lastName.length() >= 1) {
            isLastNameValid = true;
        } else {
            System.out.println("LastName is Invalid... Please Provide Valid LastName");
        }

        if (phoneNo != null && phoneNo.length() == 10) {
            isPhoneNoValid = true;
        } else {
            System.out.println("PhoneNo is Invalid... Please Provide Valid PhoneNo");
        }

        if (dob != null) {
            isDobValid = true;
        } else {
            System.out.println("Date of Birth is Invalid... Please Provide Valid Date of Birth");
        }

        if (email != null && email.contains("@")) {
            isEmailValid = true;
        } else {
            System.out.println("Email is Invalid... Please Provide Valid Email");
        }

        if (gender != null) {
            isGenderValid = true;
        } else {
            System.out.println("Gender is Invalid... Please Provide Valid Gender");
        }

        if (city != null && city.length() > 2) {
            isCityValid = true;
        } else {
            System.out.println("City is Invalid... Please Provide Valid City");
        }

        if (preferredLanguage != null && preferredLanguage.length() > 1) {
            isPreferredLanguageValid = true;
        } else {
            System.out.println("Preferred Language is Invalid... Please Provide Valid Preferred Language");
        }

        if (paymentMethod != null && (paymentMethod.equals("Credit Card") || paymentMethod.equals("Debit Card") || paymentMethod.equals("UPI"))) {
            isPaymentMethodValid = true;
        } else {
            System.out.println("Payment Method is Invalid... Please Provide Valid Payment Method");
        }

        if (membershipType != null && (membershipType.equals("Standard") || membershipType.equals("Premium"))) {
            isMembershipTypeValid = true;
        } else {
            System.out.println("Membership Type is Invalid... Please Choose Standard or Premium");
        }

        if (favoriteGenre != null && favoriteGenre.length() > 3) {
            isFavoriteGenreValid = true;
        } else {
            System.out.println("Favorite Genre is Invalid... Please Provide a Valid Genre");
        }
        
        if (isFirstNameValid && isLastNameValid && isPhoneNoValid && isDobValid && isEmailValid && isGenderValid && isCityValid && isPreferredLanguageValid && isPaymentMethodValid && isMembershipTypeValid && isFavoriteGenreValid) {
            UserValid = true;
        } else {
            System.out.println("Check credentials");
        }
        return UserValid;
    }
}





