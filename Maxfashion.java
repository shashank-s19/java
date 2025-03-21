class Maxfashion{

//Purpose
public static String signUp(String firstName,String lastName, String phoneNo , String dob ,String mailId,String gender){
String ref = null;


boolean userIsValidate = validateUserProfile(firstName,lastName,phoneNo,mailId,gender,dob);
  if(userIsValidate  == true){
	  ref = "User Signup Sucessfull";
  }else{
	  ref = "User Signup unsucessfull";
  }

	return ref ; 

}


public static void signIn(long phoneNumber){
	
}

public static boolean validateUserProfile(String firstName,String lastName,String phoneNo,String dob , String mailId,String gender){
	
	boolean UserValid = false;
	  boolean isFirstNameValid = false;
	  boolean isLastNameValid = false;
	  boolean isPhoneNoValid = false;
	  boolean isDobValid = false;
	  boolean isMailIdValid = false;
	  boolean isGenderValid= false;
	  if(firstName != null && firstName.length()>=3){
		   isFirstNameValid = true;
	  }else{
		  System.out.println("Firstname Invalid Please Provide Valid Firstname");
	  }
	  
	  if(lastName != null && lastName.length()>=1){
		  isLastNameValid = true;
	  }else{
		  System.out.println("LastName is InValid...  Please Provide Valid LastName");
	  }
	  if(phoneNo != null && phoneNo.length()>0 && phoneNo.length() == 10){
		  isPhoneNoValid = true;
	  }else{
		  System.out.println("PhoneNo is InValid.... PleaseProvide Valid PhoneNo");
	  }
	  if(dob != null ){
		 isDobValid = true;  
	  }else{
		  System.out.println("DateofBirth Is InValid...please Provide Valid DateofBirth");
	  }
	  if(mailId != null){
		   isMailIdValid = true;
	  }else{
		  System.out.println("MailId Is InValid...please provide Valid Mail id");
	  }
	  if (gender!=null){
		  isGenderValid = true;
		  
	  }else{
		  System.out.println("Gender is Invalid...please Provide Valid Gender");
	  }
	  
	  if(isFirstNameValid == true&& isLastNameValid == true &&isDobValid == true&&isPhoneNoValid == true&&isGenderValid == true&&isMailIdValid == true){
		   UserValid = true;
	  }else{
		  System.out.println("Check credentials");
	  }
	  return UserValid;
}


}