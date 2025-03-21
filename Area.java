class Area{
	static long areacodes[]={587112,587201,587101,587102,587103,587311,587116,587114,587115,587202};
	public static void main(String code[]){
		System.out.println("start of main()");
		getArea();
		System.out.println("end of main()");
	}
		//System.out.println("the areacodes added are:"+areacodes.length);
		//System.out.println("the area code avaliable are :"+areacodes[0]+","+areacodes[1]+","+areacodes[2]+","+areacodes[3]+","+areacodes[4]+","+areacodes[5]+","+areacodes[6]+","+areacodes[7]+","+areacodes[8]+","+areacodes[9]+".");
		public static void getArea(){
			System.out.println("start of getArea()");
		
		
		for(long areacode :areacodes){
			
			System.out.println(areacode);
		}
		
		System.out.println("end of getArea()");
		}


}