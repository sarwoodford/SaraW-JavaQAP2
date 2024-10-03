// code is copied from previous assignment 
public class MyPoint {
        // assign attributes
        private int x = 0;
        private int y = 0;
        
        // constructors
        // default constructor
        public MyPoint(){
    
        }
    
        public MyPoint(int x, int y){
            this.x = x;
            this.y = y;
        }
    
        // getters and setters
        public int getX(){
            return x;
        }
    
        public int getY(){
            return y;
        }
    
        public void setX(int x){
            this.x = x;
        }
    
        public void setY(int y){
            this.x = y;
        }
    
        public void setXY(int x, int y){
            this.x = x;
            this.y = y;
        }
    
        // display results
        public String toString(){
            return "(" + x + "," + y + ")";
        }
    
        // calculate distance between two lines
        public double distance(int x, int y){
            int xDiff = this.x - x;
            int yDiff = this.y - y;
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        }
    
        // copy 
        public double distance(MyPoint another){
            int xDiff = this.x - another.x;
            int yDiff = this.y - another.y;
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        }
    
        
        public double distance(){
            return Math.sqrt(this.x * this.x + this.y * this.y);
        }
    }

