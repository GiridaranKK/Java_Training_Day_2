import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 153;
		int duplicate = number;
		int duplicate1 = number;
		int count = 0;
		while(duplicate1 != 0) {
			count++;
			duplicate1/=10;
		}
		int answer = 0;
		while(duplicate != 0) {
			int rem = duplicate % 10;
			answer = answer + (int) Math.pow(rem,count);
			duplicate /= 10;
		}
		if(number == answer) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("not Armstrong Number");
		}
	}

}

//Output : Armstrong Number
