/**
 * 
 */

/**
 * @author Darshan Dave
 *
 */
import java.util.Scanner;

public class Ex_2_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number1, number2;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		//if (number1 == number2)
			//System.out.printf("%d == %d%n", number1, number2);
		
		//if (number1 != number2)
			//System.out.printf("%d != %d%n", number1, number2);
		
		if (number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		
		if (number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
		
		if (number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);
	}

}
