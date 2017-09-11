package by.itstep;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RectangleInfo {

    public Boolean check(Rectangle rect){
        double a,b,c;
        a = calc(rect.getX1(), rect.getX2(), rect.getY1(), rect.getY2());
        b = calc(rect.getX2(), rect.getX3(), rect.getY2(), rect.getY3());
        c = calc(rect.getX1(), rect.getX3(), rect.getY1(), rect.getY3());

        /*a = Math.sqrt( Math.pow( rect.getX2() - rect.getX1(),2) + Math.pow(rect.getY2()- rect.getY1(), 2));
        b = Math.sqrt( Math.pow( rect.getX3() - rect.getX2(),2) + Math.pow(rect.getY3()- rect.getY2(), 2));*/


        System.out.println(a + "-" + b + "-" + c);
        double max = Math.max(Math.max(a,b) , c);

        if (max != a && max !=b)
            return a*a + b*b == c*c;
        else if(max != b && max !=c)
            return b*b + c*c == a*a;
        else
            return a*a + c*c == b*b;



/*
        List<Integer> list = new ArrayList<Integer>();
        list.add(rect.getA());
        list.add(rect.getB());
        list.add(rect.getC());

        return (Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(list.get(3),2));
*/

    }

    private double calc(int x1, int x2, int y1, int y2){
        return Math.sqrt( Math.pow( x2 - x1,2) + Math.pow(y2- y1, 2));
    }
}
