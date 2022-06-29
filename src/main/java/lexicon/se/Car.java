package lexicon.se;
/*a. Create a class “Car” with the following fields:
        id, year, model, colour, motorSize
  b. Create a public method “drive” inside “Car” which will print:
        model + ” with motor ” + motorSize + ” can drive now.”
  c. In the main program make instance of “Car” and call the method “drive”*/
public class Car {
    public String model;
    public String color;
    public int id;
    public int year;
    public int motorSize;

    /*public Car(String model, String color, int id, int year, int motorSize) {
        this.model = model;
        this.color = color;
        this.id = id;
        this.year = year;
        this.motorSize = motorSize;
    }*/

    public static String derive(String model, int motorSize){
        return  (model + " with motor"  + motorSize +  "can drive now.");
    }
}
