import java.util.*;
class ReverseTheNumber{
	public static void main(String arr[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		if(number < 10 && number >= 0){
			System.out.print(number);
		}
		else{
			System.out.print(reverseNum(number));	
		}
	}
	static int reverseNum(int number){
		int reverseNumber = 0;
		while(number != 0){
			int remainder = number % 10;
			number /= 10;
			reverseNumber = reverseNumber * 10 + remainder;
		}
		return(reverseNumber);
	}
}