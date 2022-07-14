package Tests;

import ExceptionHandling.outOfBoundException;
import ExceptionHandling.uncheckedExceptions;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class uncheckedExceptionsTest {

    static final Logger logger = Logger.getLogger(uncheckedExceptionsTest.class.getName());

    @Test
    public void testArrayInputWithOneInput(){
        logger.info("Started tests");
        logger.info("Started tests for array input");
        uncheckedExceptions test = new uncheckedExceptions(2);
        test.arrayInput(5);
        String expected = "Printed array:  5  ";
        String actual = test.printArray();
        assertEquals(expected, actual);
    }

    @Test
    public void testArrayInputWithMaxInputs(){
        uncheckedExceptions test = new uncheckedExceptions(2);
        test.arrayInput(5);
        test.arrayInput(10);
        String expected = "Printed array:  5  10  ";
        String actual = test.printArray();
        assertEquals(expected, actual);
    }

    @Test
    public void testArrayInputWithException(){
        uncheckedExceptions test = new uncheckedExceptions(2);
        test.arrayInput(5);
        test.arrayInput(10);
        Throwable exception = assertThrows(outOfBoundException.class, () -> test.arrayInput(15));
        assertEquals("Array is full. Cant input 15 in array", exception.getMessage());
    }

    @Test
    public void testArrayInputWithNoInput(){
        uncheckedExceptions test = new uncheckedExceptions(2);
        String expected = "Printed array:  ";
        String actual = test.printArray();
        assertEquals(expected, actual);
        logger.info("Finished tests for array input");
    }

    @Test
    public void printFirstIndex(){
        logger.info("Started tests for printing at specific index");
        uncheckedExceptions test = new uncheckedExceptions(2);
        test.arrayInput(5);
        test.arrayInput(10);
        String expected = "Number at index 0 is 5";
        String actual = test.printAtIndex(0);
        assertEquals(expected, actual);
    }

    @Test
    public void printLastIndex(){
        uncheckedExceptions test = new uncheckedExceptions(2);
        test.arrayInput(5);
        test.arrayInput(10);
        String expected = "Number at index 1 is 10";
        String actual = test.printAtIndex(1);
        assertEquals(expected, actual);
    }

    @Test
    public void printNegativeIndex(){
        uncheckedExceptions test = new uncheckedExceptions(2);
        test.arrayInput(5);
        test.arrayInput(10);
        Throwable exception = assertThrows(outOfBoundException.class, () -> test.printAtIndex(-1));
        assertEquals("Index cant be negative. Index out of bound exception is thrown", exception.getMessage());
    }

    @Test
    public void printLargeIndex(){
        uncheckedExceptions test = new uncheckedExceptions(2);
        test.arrayInput(5);
        test.arrayInput(10);
        Throwable exception = assertThrows(outOfBoundException.class, () -> test.printAtIndex(10));
        assertEquals("Index is too large. Index out of bound exception is thrown", exception.getMessage());
        logger.info("Finished tests for printing element ar specific index");
        logger.info("Finished tests");
    }
}