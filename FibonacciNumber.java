public class FibonacciNumber {
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.print(firstNumber +" "+secondNumber );
		int nextNumber = 0;
		int number = 20;
		for(int i = 1; i <= number; i++) {
			nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			if(nextNumber <= number) {
				System.out.print(" "+nextNumber);
			}
		}
	}

}

//Output : 0 1 1 2 3 5 8 13