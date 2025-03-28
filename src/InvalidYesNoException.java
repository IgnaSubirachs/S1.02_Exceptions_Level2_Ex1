public class InvalidYesNoException extends Exception {
    public InvalidYesNoException()
    {
        super("Error: Please insert 'y' for yes or 'n' for no.");
    }
}
