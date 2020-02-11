public class Runner {

    public static void main(String[] args){
        Car mycar = new Car( 2016, "Ferrari", 100000, "Red" );
        System.out.println(mycar.toString());

        Rectangle myrectangle = new Rectangle(4,3);
        System.out.println(myrectangle.getArea());
        System.out.println(myrectangle.getDiagonal());
        System.out.println(myrectangle.isSquare());
        }
    }

