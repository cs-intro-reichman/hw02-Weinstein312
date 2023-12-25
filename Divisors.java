/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int i = 1;

		while (i < num + 1) {
			if (num % i == 0) {
				// Find if remainder of the input divided by any numbers below it is = 0, which means its
				// divisible and then print that number.
				System.out.println(i);
			}
			i++;
		}
	}
}
