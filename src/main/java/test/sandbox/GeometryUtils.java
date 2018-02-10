package test.sandbox;
/**
 * Created by ZeBr on 10.02.2018.
 */
public class GeometryUtils {

    public static double distance (Point a, Point b){

        return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
    }

}
