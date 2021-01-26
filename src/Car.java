public class Car {
    private static int wheels;

    public void printWheals() {
        System.out.println(getWheels());
    }



    private String name;

    public Car(String name) {
        this.name = name;
        System.out.println("b");
    }

    public static int getWheels() {

        return wheels;
    }

    public static void setWheels(int wheels) {
        Car.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    static {
        wheels = 4;
        System.out.println("a");
    }

    static {
        System.out.println("c");
    }


}
