package Tests;

import ExceptionHandling.uncheckedExceptions;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class uncheckedExceptionsTest {


    @Test
    public void testArrayInput(){
        uncheckedExceptions test = new uncheckedExceptions(2);
        test.arrayInput(5);
        String expected = "Printed array:  5  ";
        String actual = test.printArray();
        assertEquals(expected, actual);
    }

}