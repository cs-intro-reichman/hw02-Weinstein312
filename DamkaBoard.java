/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*");
				if (j < num - 1) {
					System.out.print(" ");
				}
			}
			if (i % 2 == 1) {
				System.out.print("");
			}
			if (i % 2 == 0) {
				System.out.print(" ");
			}

			System.out.println("");
			
			if (i % 2 == 0) {
				System.out.print(" ");
			}
		}
	}
}

