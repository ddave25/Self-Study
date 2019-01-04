/**
 * 
 */

/**
 * @author Darshan Dave
 * Program will calculate the product of three integers
 */
import java.util.Scanner;

public class Ex2_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, z, product;
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		z = input.nextInt();
		
		product = x * y * z;
		
		System.out.printf("The product of the three integers is: %d", product);
	}

}
