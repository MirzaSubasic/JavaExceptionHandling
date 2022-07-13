package ExceptionHandling;

public class largeNumberException extends NumberFormatException{
    public largeNumberException() {
        System.out.println("Number is too large. Try again");
        checkedException secondTry = new checkedException();
        secondTry.StringToInteger();
    }
}
