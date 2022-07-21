package ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        Array unchecked = new Array(2);
        unchecked.arrayInput(5);
        unchecked.arrayInput(10);
        unchecked.arrayInput(15);
        unchecked.printArray();
        unchecked.printAtIndex(1);
        unchecked.printAtIndex(3);
    }
}
