package ExceptionHandling;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        StringToInt checked = new StringToInt();
        String string = checked.stringInput();
        try {
            checked.stringToInteger(string);
        }
        catch (InvalidNumberException | LargeNumberException e){
            System.out.println("Invalid input. Try again");
            String str2 = checked.stringInput();
            checked.stringToInteger(str2);
        }
    }
}
