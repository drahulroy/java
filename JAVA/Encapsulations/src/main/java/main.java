public class main {

    public static void main(String[] args) {

        Car car = new Car();
        car.describeCar();
        car.setModel("verna");   //---------setting the value-----------//
        car.setMake("hyun");     //---------setting the value-----------//

        System.out.println("car is " + car.getMake());  //---------getting the value-----------//

    }
}




