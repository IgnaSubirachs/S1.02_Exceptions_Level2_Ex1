import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Entrance {
	private static final Scanner sc = new Scanner(System.in);

	public static byte readByte(String message) {
		while (true) {
			try {
				System.out.print(message + " ");
				byte value = sc.nextByte();
				if (value >= 0 && value <= 120) {
					return value;
				} else {
					System.out.println("Error: Please enter a byte value between 0 and 120.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Format error. Please enter a valid byte.");
				sc.next(); // Clear the buffer
			}
		}
	}

	public static int readInt(String message) {
		while (true) {
			try {
				System.out.print(message + " ");
				return sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Format error. Please enter a valid integer.");
				sc.next();
			}
		}
	}

	public static float readFloat(String message) {
		while (true) {
			try {
				System.out.print(message + " ");
				return sc.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Format error. Please enter a valid float (use a comma if necessary).");
				sc.next();
			}
		}
	}

	public static double readDouble(String message) {
		while (true) {
			try {
				System.out.print(message + " ");
				return sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Format error. Please enter a valid double (use a comma if necessary).");
				sc.next();
			}
		}
	}

	public static char readChar(String message) throws Exception {
		while (true) {
			System.out.print(message + " ");
			String input = sc.next();
			if (input.length() == 1) {
				return input.charAt(0);
			} else {
				throw new Exception("Input error. Please enter a single character.");
			}
		}
	}

	public static String readString(String message) {
		System.out.print(message + " ");
		return sc.next();
	}

	public static boolean readYesNo(String message) {
		while (true) {
			System.out.print(message + " (y/n) ");
			String input = sc.next().toLowerCase();
			if (input.equals("y")) {
				return true;
			} else if (input.equals("n")) {
				return false;
			} else {
				System.out.println("Invalid input. Please enter 'y' for yes or 'n' for no.");
			}
		}
	}
}
