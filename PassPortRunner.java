 class PassPortRunner {
    
        public static void main(String[] args) {
            String result = PassPort.signup("post office", "ckm", "shashank B S", "B S","22/07/2003", "shashanksbs@gmail.com", "false","shank123", "shank123", "First School", "PPEC", "FTY23X");
            System.out.println(result);
			
			    result = PassPort.signup(null, "ckm", "shashank B S", "B S","22/07/2003", "shashanksbs@gmail.com", "false","shank123", "shank123", "First School", "PPEC", "FTY23X");
            System.out.println(result);
			
			    result = PassPort.signup("post office", "ckm", "shashank B S", "B S","22/07/2003", "shashanksbs@gmail.com", "false","shank123", "shank123", "First School", "PPEC", "FTY23X");
            System.out.println(result);
        }
    }