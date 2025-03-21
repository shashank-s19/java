class Alphabet{
	static char letters[]={'A','a','b','q','s','w','r','d','c','g'};
	public static void main(String symbol[]){
		System.out.println("main started");
		getAlphabet();
		System.out.println("end main");
	}
		//System.out.println("the letters avaliable are:"+letters[0]+","+letters[1]+","+letters[2]+","+letters[3]+","+letters[4]+","+letters[5]+","+letters[6]+","+letters[7]+","+letters[8]+","+letters[9]+".");
		//<access-specifer> returnType methodName(parameter1,2)
		public static void getAlphabet(){
			System.out.println("inside getAlphabet()");
			System.out.println("the list of Alphabet avaliable are:");
		for(char letter:letters){
			System.out.println(letter);
			
		}
		System.out.println("end of the getAlphabet()");
		}

	} 
