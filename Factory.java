class Factory{
	int id;
	String factoryName;
	String type;
	int capacity;
	String emailId;
	String area;


	Factory(){
		this(12);
		System.out.println("invoke factory");
	
	}
	Factory(int id){
		this("stealx","Manufacture");
		this.id=id;
		System.out.println("One argument constructor that is id");
	}
	Factory(String factoryName, String type){
		this("steal@gmail.com",500);
		this.factoryName=factoryName;
		this.type=type;
		System.out.println("two argument constructor that is factoryname and type");
		
	}
	Factory(String emailId,int capacity){
		this("Banglore");
		this.emailId=emailId;
		this.capacity=capacity;
		System.out.println("One argument constructor that is Area");
	}
	Factory(String area){
		this.area=area;
		System.out.println("One argument constructor that is Area");
	}
	
	public void display(){
		System.out.println("the id is"+id);
		System.out.println("the factoryName is"+factoryName);
		System.out.println("the id type"+type);
		System.out.println("the emailId is"+emailId);
		System.out.println("the area is"+area);
	}
	

}