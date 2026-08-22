package jav.Area;
import jav.MySqpackage.Square;
import jav.Mypackage.Rectangle;

public class AreaOfShapes 
{
    public static void main(String args[])
    {
        Square s = new Square();
        System.out.println(s.displayArea(7));

        Rectangle r = new Rectangle();
        System.out.println(r.displayArea(7, 12));
    }
}