package by.itstep;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class TestCalculator extends Assert{

    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @AfterClass
    public static void destroy(){
        System.out.println("test done");
    }


    @Test
    public void testPlus(){
        Integer result = calculator.plus(10,20);
        //System.out.println(result.equals(30));
        assertTrue("expected 30",result.equals(30));

    }
    @Test
    public void test2Plus(){
        assertEquals("Expected 4", (long)calculator.plus(2,2), 4L);
    }

    @Test
    public void testMinus(){
        Integer result = calculator.minus(20,10);
        assertTrue("expected 30",result.equals(10));
    }

    @Test
    public void testRectangle(){
        Mock rect = new Mock()
    }



}
