public class App {
    public static void main(String[] args) {
        Car car = new Car("Car1");
        Car car2 = new Car("Car2");

        System.out.println(Car.getWheels());
        System.out.println(car.getName());
        System.out.println(car2.getName());

    }

}
