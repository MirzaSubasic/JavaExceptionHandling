package ExceptionHandling;

import  java.lang.*;

public class outOfBoundException extends ArrayIndexOutOfBoundsException{
    public outOfBoundException(String message){
        System.out.println(message);
    }
}
