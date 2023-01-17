public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Mercedes");
        car.setModel("GLS");
        car.setColor("Gray");
        car.setConvertible(false);
        car.setDoors(5);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car gabriel = new Car();
        gabriel.setMake("tesla");
        gabriel.setModel("X5");
        gabriel.setColor("GREEN");
        gabriel.setConvertible(false);
        gabriel.setDoors(5);
        System.out.println("make = " + gabriel.getMake());
        System.out.println("model = " + gabriel.getModel());
        gabriel.describeCar();
    }
}