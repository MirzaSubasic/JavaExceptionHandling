package ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        Array unchecked = new Array(2);

        try {
            unchecked.arrayInput(5);
            unchecked.arrayInput(10);
            unchecked.arrayInput(15);
        }
        catch (OutOfBoundException e){
            e.getMessage();
        }
        unchecked.printArray();
        try {
            System.out.println(unchecked.printAtIndex(1));
            System.out.println(unchecked.printAtIndex(3));
        }
        catch (OutOfBoundException e){
            System.out.println("Index out of bound exception is thrown. Index is negative or too large");
        }
    }
}
