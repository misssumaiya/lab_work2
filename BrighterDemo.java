package problem_E2_10;

import java.awt.Color;
import java.util.concurrent.Callable;

public class BrighterDemo {
    public static void main(String[]args)
    {
        Color brightColor=new Color(50,100,150);
        Color brighter =brightColor.brighter();
        System.out.println("the value of red: " +brighter.getRed());
        System.out.println("the value of green: " +brighter.getGreen());
        System.out.println("the value of blue: " +brighter.getBlue());


            }
        };


