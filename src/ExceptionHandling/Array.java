package ExceptionHandling;
/*
*Checked exception - checked at compile time
*Unchecked - not checked at compile time, there is no syntax mistake
* */

public class Array {
    private int[] array;
    private int maxSize,lastIndex;

    public Array(int size){
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
        if(getLastIndex()+1 >= getMaxSize())
            throw new OutOfBoundException();
        int[] arr= getArray();
        arr[++lastIndex] = number;
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
        if(index >= getMaxSize() | index < 0)
            throw new OutOfBoundException();
        else {
            int[] arr = getArray();
            int number = arr[index];
            printIndex = "Number at index " + index + " is " + number;
        }
        return printIndex;
    }
}
