package test.sandbox;
import java.util.Random;

/**
 * Created by ZeBr on 05.02.2018.
 */
public class MyFirstProgramm {

    public static void main(String[] args) {
        hello("Friend");

        double a = 5;
        double b = 6;
        double l = 7;
        Random random = new Random();
        Point one = new Point(Math.random()*100,Math.random()*100);
        Point two = new Point(Math.random()*100,Math.random()*100);
        Square s = new Square(l);
        Rectangle r = new Rectangle(a, b);
        System.out.println("Area of rectangle with sides " + r.a + " " + r.b + " is " + r.area());
        System.out.println("Area of square with side " + s.l +" is " + s.area());
        System.out.println("Distance between point1 ("+ one.x + ", " + one.y + ") and point2 (" + two.x + ", " + two.y + ") is " + GeometryUtils.distance(one, two));
    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }

}
