package lexicon.se;

public class Main {


    public static void main(String[] args) {

        Car car1 = new Car();
        Car.derive("volvo",2400);
        System.out.println(Car.derive("volvo",2400));
        //-----------------------------------------getArea

        Rectangle firstRectangle = new Rectangle();
        firstRectangle.setWidth( 12.3);
        firstRectangle.setHeight(14.1);
        System.out.println(Rectangle.getArea(12.43,43.55));
        System.out.println(firstRectangle.toString());



    }
}