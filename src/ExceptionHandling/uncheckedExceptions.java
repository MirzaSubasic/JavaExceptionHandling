package ExceptionHandling;
/*
*Checked exception - checked at compile time
*Unchecked - not checked at compile time, there is no syntax mistake
* */

public class uncheckedExceptions {
    private int[] array;
    private int maxSize,lastIndex;

    public uncheckedExceptions(int size){
        maxSize = size;
        array = new int[size];
        lastIndex = -1;
    }

    public int[] getArray() {
        return array;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void arrayInput(int number) {
        try {
            if(getLastIndex()+1 >= getMaxSize())
                throw new outOfBoundException();
            else {
                int[] arr= getArray();
                arr[++lastIndex] = number;
            }
        }
        catch (outOfBoundException e){
            System.out.println("Array is full. Cant input " + number + " in array");
        }
    }

    public String printArray() {
        int[] arr = getArray();
        String printed = "Printed array:  ";
        System.out.print("Printed array:  ");
        for (int i=0;i<=getLastIndex(); i++) {
            System.out.print(arr[i] + "  ");
            printed += arr[i] + "  ";
        }
        System.out.println();
        return printed;
    }

    public String printAtIndex(int index) {
        String printIndex = "";
        try {
            if(index >= getMaxSize())
                throw new outOfBoundException();
            if(index < 0)
                throw new outOfBoundException();
            else {
                int[] arr = getArray();
                int number = arr[index];
                printIndex = "Number at index " + index + " is " + number;
                System.out.println("Number at index " + index + " is " + number);
            }
        }
        catch (outOfBoundException e){
            System.out.println("Index out of bound exception is thrown. Index is negative or too large");
        }
        return printIndex;
    }
}
