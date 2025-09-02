// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 5*5*5*5*5


class RightAngleWithStar{
	public static void main(String[] args){
		for(int i=1; i<6; i++){
			System.out.print(1);
			for(int j=2; j<=i; j++){
				System.out.print("*" + i);
			}
			System.out.println();
		}
	}
}	
	
				// if (j < i) {
                    // System.out.print(i + "*");
                // } else {
                    // System.out.print(i);  // last number without '*'
                // }	
	
	