package by.itstep;

import org.junit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.mockito.Mockito.*;

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
        Rectangle r = mock(Rectangle.class);
        when(r.getX1()).thenReturn(0);
        when(r.getX2()).thenReturn(3);
        when(r.getX3()).thenReturn(3);
        when(r.getY1()).thenReturn(0);
        when(r.getY2()).thenReturn(4);
        when(r.getY3()).thenReturn(0);

        RectangleInfo info = new RectangleInfo();
        assertTrue(info.check(r));




/*
        when(rect.getA()).thenReturn(3).thenReturn(3);
        when(rect.getB()).thenReturn(4).thenReturn(4);
        when(rect.getC()).thenReturn(5).thenReturn(6);

    *//*
            List<Integer> list = new ArrayList<Integer>();
            list.add(rect.getA());
            list.add(rect.getB());
            list.add(rect.getC());
            //sort
            assertTrue(Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(list.get(3),2) );
    *//*
            RectangleInfo info = new RectangleInfo();
            assertTrue("True exp", info.check(rect));
            assertFalse("False exp",info.check(rect));*/



    }



}
