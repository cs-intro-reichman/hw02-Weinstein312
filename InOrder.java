/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		// num1 is the number that is checked against, it is set as -1 so it 
		// will always be less than num2 initially so the program can start
		int num1 = -1; 
		// num2 is the number thats randomly generated
		int num2 = 0;
		while (num2 >= num1) { 
			// loop if generated number is greater or equal to previous number
			num2 = (int) (10 * Math.random());

			// this sets num1 to be the previously generated number and prints before looping
			if (num2 >= num1) {
				System.out.println(num2);
				num1 = num2;
			}
		}
	}
}
