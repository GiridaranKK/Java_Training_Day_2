import java.util.*;
class Multiplication{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number1: ");
		int number1 = sc.nextInt();
		System.out.print("Enter the number2: ");
		int number2 = sc.nextInt();
		int answer = 0;
		for(int i = 1;i <= number2;i++){
			answer += number1;
		}
		System.out.print(answer);
	}
}