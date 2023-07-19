package problem_E2_3;

import java.awt.*;

public class TestAreaRunner {
    public static void main(String[]args)
    {
        Rectangle rectangle=new Rectangle(3,4,5,6);
        TestArea test=new TestArea();
        System.out.println(test.area((int)rectangle.getHeight(),(int)rectangle.getWidth()));
    }
}
