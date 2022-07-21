package Tests;

import ExceptionHandling.Array;
import ExceptionHandling.OutOfBoundException;
import ExceptionHandling.StringToInt;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class uncheckedExceptionsTest {

    static final Logger logger = Logger.getLogger(uncheckedExceptionsTest.class.getName());

    @Test
    public void testArrayInputWithOneInput(){
        logger.info("Started tests");
        logger.info("Started tests for array input");
        Array test = new Array(2);
        test.arrayInput(5);
        String expected = "Printed array:  5  ";
        String actual = test.printArray();
        assertEquals(expected, actual);
    }

    @Test
    public void testArrayInputWithMaxInputs(){
        Array test = new Array(2);
        test.arrayInput(5);
        test.arrayInput(10);
        String expected = "Printed array:  5  10  ";
        String actual = test.printArray();
        assertEquals(expected, actual);
    }

    @Test
    public void testArrayInputWithException(){
        Array test = new Array(2);
        test.arrayInput(5);
        test.arrayInput(10);
        Throwable exception = assertThrows(OutOfBoundException.class, () -> test.arrayInput(15));
        assertEquals(null, exception.getMessage());
    }

    @Test
    public void testArrayInputWithNoInput(){
        Array test = new Array(2);
        String expected = "Printed array:  ";
        String actual = test.printArray();
        assertEquals(expected, actual);
        logger.info("Finished tests for array input");
    }

    @Test
    public void printFirstIndex(){
        logger.info("Started tests for printing at specific index");
        Array test = new Array(2);
        test.arrayInput(5);
        test.arrayInput(10);
        String expected = "Number at index 0 is 5";
        String actual = test.printAtIndex(0);
        assertEquals(expected, actual);
    }

    @Test
    public void printLastIndex(){
        Array test = new Array(2);
        test.arrayInput(5);
        test.arrayInput(10);
        String expected = "Number at index 1 is 10";
        String actual = test.printAtIndex(1);
        assertEquals(expected, actual);
    }

    @Test
    public void printNegativeIndex(){
        Array test = new Array(2);
        test.arrayInput(5);
        test.arrayInput(10);
        Throwable exception = assertThrows(OutOfBoundException.class, () -> test.printAtIndex(-1));
        assertEquals(null, exception.getMessage());
    }

    @Test
    public void printLargeIndex(){
        Array test = new Array(2);
        test.arrayInput(5);
        test.arrayInput(10);
        Throwable exception = assertThrows(OutOfBoundException.class, () -> test.printAtIndex(10));
        assertEquals(null, exception.getMessage());
        logger.info("Finished tests for printing element ar specific index");
        logger.info("Finished tests");
    }
}