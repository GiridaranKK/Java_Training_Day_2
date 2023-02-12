import java.util.*;
class NumToWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = sc.nextInt();
		String answer = "";
		String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		while(number!=0){
			int reminder = number%10;
			answer = words[reminder] + " " + answer;
			number/=10;
		}
		System.out.print(answer);
	}
}