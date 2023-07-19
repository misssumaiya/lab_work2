package problem_E2_6;

import java.awt.*;

public class AddTester {
    public static void main(String[]args)
    {
        Rectangle rectangle=new Rectangle(5,10,20,30);
        rectangle.add(0,0);
        System.out.println("expected x; 0");
        System.out.println("expected y; 0");
        System.out.println("expected heigt :40");
        System.out.println("expected width :25");
        System.out.println("\n actual x :" +rectangle.getX());
        System.out.println("\n actual y :" +rectangle.getY());
        System.out.println("\n actual width :" +rectangle.getWidth());
        System.out.println("\n actual height :" +rectangle.getHeight());



    }
}
