package ExceptionHandling;

public class demo {
    public static void main(String[] args) {
        uncheckedExceptions unchecked = new uncheckedExceptions(2);
        unchecked.arrayInput(5);
        unchecked.arrayInput(10);
        unchecked.arrayInput(15);
        unchecked.printArray();
        unchecked.printAtIndex(1);
        unchecked.printAtIndex(3);
    }
}
