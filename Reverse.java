/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String str = args[0];
		String strOut = "";
		int length = str.length(); 

		int i = 0;
		while (i < length) { 
			// Loop this block the length of the string times and keep adding
			// to an output string in reverse order
			strOut = strOut + str.charAt(length - 1 - i);
			i++;
		}

		System.out.println(strOut);
		System.out.println("The middle character is " + strOut.charAt(length / 2));
	}
}
