class FibonacciSeries{
	public static void main(String[] args){
		int n =30;
		int a =0;
		int b = 1;
		
		System.out.print(a + " " + b + " ");
		
		for(int i = 1; i <=n; i++){
			int nextTerm = a + b;
			a =b;
			b = nextTerm;
			System.out.print(nextTerm + " ");
		}
	}
}