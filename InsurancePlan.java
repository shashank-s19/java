class InsurancePlan{

public static double 	search(String insuranceName){
	double planPrice = 0.0;
	
	if(insuranceName == "ICIC life Insurance"){
		planPrice = 8999.0;
	}
	else if(insuranceName == "LIC life Insurance"){
	planPrice = 3444;
	
}
	else if(insuranceName == "HDFC Life insurance"){
		planPrice =999.0;
		
	}
	
	else if(insuranceName == "Max Life Insurance"){
		planPrice = 9999;
		
	}
	else if(insuranceName == "Bajaj Life Insurance"){
		planPrice = 5999.0;
		
	}
	else if(insuranceName == "SBI Life insurance"){
	planPrice = 6999;
	
	}
	else if(insuranceName == "Kotak Life Insurance"){
		planPrice = 7666;
	}
	else if(insuranceName == "Baroda Life Insurance"){
		planPrice = 6666;
	}
	else{
		System.out.println("Please Provide  Specific InsuranceName");
	
	
	}
	return planPrice;
}
}