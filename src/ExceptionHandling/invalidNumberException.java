package ExceptionHandling;

public class invalidNumberException extends NumberFormatException{
    public invalidNumberException() {
        System.out.println("Invalid input. Try again");
        checkedException secondTry = new checkedException();
        secondTry.StringToInteger();
    }
}
