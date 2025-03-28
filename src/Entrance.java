import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Entrance {
    static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void clearBuffer() {
       if(sc.hasNextLine()) {
           sc.nextLine();
       }
    }

    public static byte readByte(String message) {
        System.out.println(message);
        return sc.nextByte();
    }

    public static int readInt(String message) {
        System.out.println(message);
        return sc.nextInt();
    }

    public static float readFloat(String message) {
        System.out.println(message);
        return sc.nextFloat();
    }

    public static double readDouble(String message) {
        System.out.println(message);
        return sc.nextDouble();
    }


    public static char readChar(String message) {
        System.out.println(message);
        String input = sc.nextLine().trim();
        if (input.length() > 1) {
            throw new InputMismatchException("This is not a single character");
        } else {
            return input.charAt(0);
        }
    }

    public static String readString(String message) {
        System.out.println(message);
        String input = sc.nextLine();
        if (!input.matches("[A-Za-z\\s]+")) {
            throw new InputMismatchException("Please only accept words");
        } else {
            return input;
        }
    }

    public static boolean readYesNo(String message) {
        System.out.print(message + " (y/n): ");
        String input = sc.nextLine().trim().toLowerCase();
        if (input.equals("y")) {
            return true;
        } else if (input.equals("n")) {
            return false;
        } else {
            throw new InputMismatchException("Error: Please insert 'y' for yes or 'n' for no.");
        }
    }

}