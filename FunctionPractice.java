public class FunctionPractice {
    public static void main(String[] arg){
        // areaSquare(6, 3.0);
        // areaCircle(1);
        // int result;
        // result = areaRectangle(8, 89);
        // System.out.println(result);
        order(16, 19, 12);
    }
    public static void order(int num1, int num2, int num3){

        if(num1 < 7);
        System.out.println(num1);
 
        if(num2 < 10);
        System.out.println(num2);
 
        if(num3 < 13);
        System.out.println(num3);
     }



    public static void areaSquare(int s, double d) {
        System.out.println(s*s);
    }

    // write a function that calculates the area of a rectangle
    public static int areaRectangle(int l, int w){
        int area;
        area = l*w;
        return area;
    }
    public static void areaCircle(int r) {
        System.out.println(3.14 * r * r);
    }
}