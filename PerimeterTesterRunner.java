package problem_E2_4;

import java.awt.*;

public class PerimeterTesterRunner {
    public static void main(String[]args)
    {
        Rectangle rectangle=new Rectangle(4,5,6,7);
        PerimeterTester test=new PerimeterTester();
        System.out.println(test.perimeter((int)rectangle.getHeight(),(int)rectangle.getWidth()));
    }
}
