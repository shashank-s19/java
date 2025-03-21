class PassPort {
    public static String signup(String loc, String area, String firstName, String lastName, String birthDate, String email, String userId, String password, String confirmPassword, String securityQuestion, String securityAnswer, String captcha) {
        String result = null;
			boolean isuserValid= validateUserProfile(loc, area, firstName, lastName, birthDate, email,  userId, password, confirmPassword, securityQuestion, securityAnswer, captcha);

        if (isuserValid){
            result = "Registration successful!";
        } else {
            result = "Registration invslid... Please try again later.";
        }
        return result;
    }

    public static boolean validateUserProfile(String loc, String area, String firstName, String lastName, String birthDate, 
	String email, String userId, String password, String confirmPassword, String securityQuestion, String securityAnswer, String captcha) {
        boolean isuserValid = false;
		
		
			boolean isLocationValid = false;
			boolean isAreaValid = false;
			boolean isFirstNameValid = false;
			boolean isLastNameValid = false;
			boolean isBirthDateValid = false;
			boolean isEmailValid = false;
			boolean isUserIdValid = false;
			boolean isPasswordValid = false;
			boolean isConfirmPasswordValid = false;
			boolean isSecurityQuestionValid = false;
			boolean isSecurityAnswerValid = false;
			boolean isCaptchaValid = false;

			
        if (loc != null && !loc.isEmpty()) {
            isLocationValid = true;
        }
    
        if (area != null && !area.isEmpty()) {
            isAreaValid = true;
        }

        if (firstName !=null&&firstName.length()>=3 && !firstName.isEmpty()) {
            isFirstNameValid = true;
        }

        if (lastName != null && lastName.length()>=1 && !lastName.isEmpty()) {
            isLastNameValid = true;
        }
        if (birthDate != null && !birthDate.isEmpty()) {
            isBirthDateValid = true;
        }
        if (email != null  && !email.isEmpty()) {
            isEmailValid = true;
        }
       
        if (userId != null && !userId.isEmpty()) {
            isUserIdValid = true;
        }
        if (password != null && password.length() >= 6 &&!password.isEmpty()) {
            isPasswordValid = true;
        }
        if (confirmPassword != null && confirmPassword==password) {
            isConfirmPasswordValid = true;
        }

        if (securityQuestion != null) {
            isSecurityQuestionValid = true;
            
        }
		if(securityAnswer != null){
			isSecurityAnswerValid = true;
		}

        if (captcha != null && !captcha.isEmpty() ) {
            isCaptchaValid = true;
        }

        if (isLocationValid==true && isAreaValid==true && isFirstNameValid==true && isLastNameValid ==true&& isBirthDateValid ==true&& isEmailValid==true && isUserIdValid==true && isPasswordValid ==true&& isConfirmPasswordValid ==true&& isSecurityQuestionValid==true && isSecurityAnswerValid==true && isCaptchaValid==true) {
           isuserValid = true;
        }

        return isuserValid;
  

  }
}
 

  