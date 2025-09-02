class PrintEvenNumbers{
	public static void main(String[] args){
		printEvenNumber();
	}
	
	public static void printEvenNumber(){
		int num = 1;
		while(num <= 50){
			if(num % 2 == 0){
				System.out.print( num + " ");
				
			}
			num++;
		}
	}
}