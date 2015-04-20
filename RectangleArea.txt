public class RectangleArea {
    public static void main(String args []) {

        System.out.println("Hello World");
    }

    private static Double calculateArea(Double length, Double breadth) {
        Double area = 0.0;
        if(length > 0.0 && breadth > 0.0)
            area =  length*breadth;
     
        return area;
    }


}