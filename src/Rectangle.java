public class Rectangle {




    private double length;
    private  double width;

    public Rectangle( double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }


    public void setDoubleLength(double length) {
        this.length = length;
    }


    public void setDoubleWidth(int doubleWidth) {
        this.width = width;
    }


    public double getWidth() {
        return width;
    }


    public double getArea(){
        return width * length;
    }

    public double getDiagonal(){
        return Math.sqrt((length * length) + (width * width));
    }




    public boolean isSquare(){
        if(length == width){
            return true;
        }
        else{
            return false;
        }
    }






































}
