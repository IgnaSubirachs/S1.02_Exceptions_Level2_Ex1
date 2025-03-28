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


    public static char readChar(String message) throws InvalidCharException {
        System.out.println(message);
        String input = sc.nextLine().trim();
        if (input.length() > 1) {
            throw new InvalidCharException();
        } else {
            return input.charAt(0);
        }
    }

    public static String readString(String message) throws InvalidStringException {
        System.out.println(message);
        String input = sc.nextLine();
        if (!input.matches("[A-Za-z\\s]+")) {
            throw new InvalidStringException();
        } else {
            return input;
        }
    }

    public static boolean readYesNo(String message) throws InvalidYesNoException {
        System.out.print(message + " (y/n): ");
        String input = sc.nextLine().trim().toLowerCase();
        if (input.equals("y")) {
            return true;
        } else if (input.equals("n")) {
            return false;
        } else {
            throw new InvalidYesNoException();
        }
    }

}