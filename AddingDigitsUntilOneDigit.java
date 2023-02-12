import java.util.*;
class AddingDigitsUntilOneDigit{
	public static void main(String arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		if(number < 10 ){
			System.out.print(number);
		}
		else{
			System.out.print(Simplify(number));	
		}
	}
	static int Simplify(int number){
		int simNumber = 0;
		while(number != 0){
			int remainder = number % 10;
			number = number / 10;
			simNumber += remainder;
		}
		if(simNumber > 9){
			return Simplify(simNumber);
		}
		return simNumber;
	}
}