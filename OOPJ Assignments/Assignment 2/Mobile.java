class Mobile{
	String model;
	static int totalMobiles = 0;
	
	Mobile(String model){
		this.model = model;
		totalMobiles++;
	}
	
	String getModel(){
		return model;
	}
	
	static void showTotalMobiles(){
		System.out.println("Total mobiles in stock: "+totalMobiles);
	}
	
	public static void main(String[] args){
		Mobile mobile1 = new Mobile("Samsung Galaxy M32");
		Mobile mobile2 = new Mobile("Redmi Note 12");
		
		System.out.println("Mobile1 model: "+ mobile1.getModel());
		System.out.println("Mobile2 model: "+ mobile2.getModel());
		
		showTotalMobiles();
	}
}