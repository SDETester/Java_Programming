package day32_finalKeyword.carTask_methodOverriding;

public class Car {

    private String make, model, color;
    private int year;
    private double price;

    public static int numberOfWheels;
    public static boolean hasBattery;

    public Car(String model, String color, int year, double price) {
        setMake( getClass().getSimpleName() ); // setting the class name to the make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    static{
        numberOfWheels = 4;
        hasBattery = true;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 0 ){ // if specified year is negative or zero
            System.err.println("Invalid year: "+year);
            System.exit(1); // terminates the program
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){ // if specified price is negative or zero
            System.err.println("Invalid price: "+price);
            System.exit(1); // terminates the program
        }
        this.price = price;
    }


    public void start(){
        System.out.println("Press the brake and twist the key to ignition to start "+make+" "+model);
    }

    @Override
    public String toString() {
        return make+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", wheels=" + numberOfWheels +
                '}';
    }

}
/*
1. Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)
            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero
            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name
            Methods:
                start(): "Press the brake and twist the key to ignition"
                toString()
 */


