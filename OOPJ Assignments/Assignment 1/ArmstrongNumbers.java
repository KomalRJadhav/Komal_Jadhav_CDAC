class ArmstrongNumbers{
	public static void main(String[] args){
		for (int number = 100; number <= 500; number++) {
            int temp = number;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;              
                sum = sum + digit * digit * digit;  
                temp = temp / 10;                   
            }

            if (number == sum) {
                System.out.println(number);
            }
        }
	}
}