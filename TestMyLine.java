public class TestMyLine {
    public static void main(String[] args){
        MyPoint begin = new MyPoint(0,0);
        MyPoint end = new MyPoint(3, 4);
        MyLine line1 = new MyLine(begin, end);

        System.out.println("Line Coordinates: " + line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " +  String.format("%.2f degrees", Math.toDegrees(line1.getGradient())));
    }
    
}
