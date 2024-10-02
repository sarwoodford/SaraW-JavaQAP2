public class TestMyRectangle {
    public static void main(String[] args){
        MyRectangle rectangle1 = new MyRectangle(2, 2, 3, 3);

        System.out.println("Rectangle measurements: " + rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
    }
}
