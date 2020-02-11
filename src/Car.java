public class Car {
    private int year;
    private int miles;
    private String model;


    private String color;




    public Car(int year, String model, int miles, String color) {
        this.year = year;
        this.color = color;
        this.miles = miles;
        this.model = model;

    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }



    public void setMiles(int miles){
        this.miles = miles;
    }

    public int getMiles(){
        return miles;
    }

    public void setModel(String model){
    this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setColor(String color){
        this.color = color;
    }


    public String getColor() {
        return color;
    }



    public void drive(int miles){
        this.miles += miles;
    }




    public String toString(){
        return "This car is a " + this.getYear() + " " + this.getColor() + " " + this.getModel() + " with " + getMiles() + " miles. ";

    }

}
