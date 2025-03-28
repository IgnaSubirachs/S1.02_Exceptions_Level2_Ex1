import java.util.InputMismatchException;

public class Questions {

    public static void askForByte() {
        byte value = 0;
        boolean ageOk = false;
        while (!ageOk) {
            try {
                value = Entrance.readByte("Please enter your age");
                if (value > 0 && value < 120) {
                    System.out.println("Your age is :" + value);
                    ageOk = true;
                } else {
                    System.out.println("This can't be you age");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: This isn't a Byte number. Try Again.");
                Entrance.clearBuffer();
            }

        }

    }

    public static void askForInteger() {
        boolean intOk = false;
        int valor;
        while (!intOk) {
            try {
                valor = Entrance.readInt("Please enter a Integer number");
                intOk = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter a integer number");
                Entrance.clearBuffer();
            }
        }
    }

    public static void askForFloat() {
        boolean floatOk = false;
        float value;
        while (!floatOk) {
            try {
                value = Entrance.readFloat("Please enter a float number");
                floatOk = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter a float number.");
                Entrance.clearBuffer();
            }
        }
    }

    public static void askForDouble() {
        boolean doubleOk = false;
        double value;
        while (!doubleOk) {
            try {
                value = Entrance.readDouble("Please enter a double number");
                doubleOk = true;
                Entrance.clearBuffer();
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter a double number.");
                Entrance.clearBuffer();
            }
        }
    }

    public static void askForChar() {
        boolean charOk = false;
        char input;
        while (!charOk) {
            try {
                input = Entrance.readChar("Please enter only one character");
                System.out.println("Your single character is :" + input);
                charOk = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                Entrance.clearBuffer();
            }
        }
    }

    public static void askForString() {
        boolean stringOK = false;
        String input;
        while (!stringOK) {
            try {
                input = Entrance.readString("Please enter a phrase");
                System.out.println("Your phrase is :" + input);
                stringOK = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                Entrance.clearBuffer();
            }
        }
    }

    public static void askYesOrNot() {
        boolean exitFromProgram;
        boolean askQuestion = false;
        while (!askQuestion) {
            try {
                exitFromProgram = Entrance.readYesNo("Do you want to exit?");
                System.out.println("You answer is: " + exitFromProgram);
                askQuestion = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                Entrance.clearBuffer();
            }
        }
    }
}




