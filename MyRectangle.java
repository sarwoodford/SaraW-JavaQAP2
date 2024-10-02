public class MyRectangle {
    // assign attributes
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // constructors
    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public int getArea(){
        int width = bottomRight.getX() - topLeft.getX();
        int height = bottomRight.getY() - topLeft.getY();
        return width * height;
    }

    public int getPerimeter(){
        int width = bottomRight.getX() - topLeft.getX();
        int height = bottomRight.getY() - topLeft.getY();
        return 2 * (width + height);
    }

    public String toString(){
        return("My Rectangle [top left= " + topLeft + ", bottom right= " + bottomRight + "]");
    }
}
