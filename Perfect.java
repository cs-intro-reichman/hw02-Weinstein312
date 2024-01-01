/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		int counter = 1;
		String str = num + " is a perfect number since " + num + " = 1";

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				//System.out.println(i);
				str = str + " + " + i;
				counter += i;
			}
		}

		if (counter == num) {
			System.out.println(str);
		}
		else {
			System.out.println(num + " is not a perfect number");
		}
	}
}
