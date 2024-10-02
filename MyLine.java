public class MyLine {
    // assign attributes 
    private MyPoint begin;
    private MyPoint end;

    // constructors 
    public MyLine(MyPoint end, MyPoint begin){
        this.begin = begin;
        this.end = end;
    }

    public MyLine(int x1, int y1, int x2, int y2){
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    // getters and setters 
    public MyPoint getBegin(){
        return begin;
    }

    public MyPoint getEnd(){
        return end;
    }

    public void setBegin(MyPoint begin){
        this.begin = begin;
    }

    public void setEnd(MyPoint end){
        this.end = end;
    }

    // methods 

    public double getLength(){
        return Math.hypot(end.getX() - begin.getX(), end.getY() - begin.getY());
    }

    public double getGradient(){
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString(){
        return "My Line [begin= " + begin + ", end= " + end + "]";
    }

}
