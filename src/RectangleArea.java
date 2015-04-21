/**
 * Created by naveen on 4/20/2015.
 */
public class RectangleArea {
    public static void main(String args []) {

        System.out.println(calculateArea(5.0, 8.0));
        System.out.println(calculateArea(7.0));
    }

    private static Double calculateArea(Double length, Double breadth) {
        Double area = 0.0;
        if(length > 0.0 && breadth > 0.0)
            area =  length*breadth;

        return area;
    }

    private static Double calculateArea(Double side) {
        Double area = 0.0;
        if(side > 0.0)
            area =  side*side;

        return area;
    }
}
