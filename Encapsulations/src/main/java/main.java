public class main {

    public static void main(String[] args) {

        Car car = new Car();
        car.describeCar();
        car.setModel("verna");   //---------setting the value-----------//
        car.setMake("hyun");

        System.out.println("car is " + car.getModel());  //---------getting the value-----------//

    }
}
