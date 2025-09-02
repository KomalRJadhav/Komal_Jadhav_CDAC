class RightAnglePatternWithStarAndIncrement{
	public static void main(String[] args){
		
		for(int i=1; i<6; i++){
			int num = 1;
			for(int j=1; j<=i; j++){
				if(j < i){
					System.out.print(num + "*");
				}else{
					System.out.print(num);
				}	
				num+=2;
			}
			System.out.println();
		}
	}
}