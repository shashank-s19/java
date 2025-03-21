class Hostar{
	static String hindiSeries[]={"The Family Man","Sacred Games","Panchayat","Asur","Special Ops","Aarya Paatal Lok","Delhi Crime","The Night Manager","Farzi","Aspirants"};
	static String malayalamSeries[]={"Jai Mahendran","Masterpeace","Menaka Rock Paper Scissors","Amma Makal","Just Married Things","Meenaviyal", "Perilloor Premier League","Something Something like Love","soul stories","nishabdam"};
	static String englishSeries[]={"Lost","Mr. Robot","Gotham","Sons of Anarchy","Sherlock","lost","outlander","loki","the lost of us","fallout"};
	public static void main(String series[]){
		System.out.println("start of main():");
		getHostar();
		System.out.println("end of main():");
	}
	//System.out.println("the hindiSeries avaliable are:"+hindiSeries[0]+","+hindiSeries[1]+","+hindiSeries[2]+","+hindiSeries[3]+","+hindiSeries[4]+","+hindiSeries[5]+","+hindiSeries[6]+","+hindiSeries[7]+","+hindiSeries[8]+","+hindiSeries[9]+".");
	//System.out.println("the malayalamSeries avaliable are:"+malayalamSeries[0]+","+malayalamSeries[1]+","+malayalamSeries[2]+","+malayalamSeries[3]+","+malayalamSeries[4]+","+malayalamSeries[5]+","+malayalamSeries[6]+","+malayalamSeries[7]+","+malayalamSeries[8]+","+malayalamSeries[9]+".");
	//System.out.println("the englishSeries avaliable are:"+englishSeries[0]+","+englishSeries[1]+","+englishSeries[2]+","+englishSeries[3]+","+englishSeries[4]+","+englishSeries[5]+","+englishSeries[6]+","+englishSeries[7]+","+englishSeries[8]+","+englishSeries[9]+".");
	public static void getHostar(){
		System.out.println("start of getHostar():");
	for(String hserie:hindiSeries){
		System.out.println(hserie);
		
	}
	for(String mserie:malayalamSeries){
		System.out.println(mserie);
	}
	for( String eseire:englishSeries){
		System.out.println(eseire);
	}
	System.out.println("end of getHostar():");
	}
}