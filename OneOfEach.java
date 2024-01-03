
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		boolean boy = false;
		boolean girl = false;
		double rand = 0;
		int counter = 0;

		while (!boy || !girl) {
			// loops till boy and girl are both born
			rand = Math.random();

			if (rand >= 0.5) {
				System.out.print("b ");
				boy = true;
			}
			else {
				System.out.print("g ");
				girl = true;
			}
			counter++;
		}
		System.out.println("");
		System.out.print("You made it... and you now have " + counter + " children.");
	}
}
