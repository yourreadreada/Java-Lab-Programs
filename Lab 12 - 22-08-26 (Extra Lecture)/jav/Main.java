package jav;

import jav.MySqpackage.Square;
import jav.Mypackage.Rectangle;

public class Main 
{
   public static void main(String args[]) 
   {
      Square s = new Square();
      System.out.println(s.displayArea(7));

      Rectangle r = new Rectangle();
      System.out.println(r.displayArea(7, 12));
   }
}