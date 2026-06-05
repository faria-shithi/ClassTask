public class Car {
    String owner, brandName,serialNumber;
    double fuel;
    boolean isRunning;
    Car(String owner, String brandName, String serialNumber, double fuel) {
        this.owner = owner;
        this.brandName = brandName;
        this.serialNumber = serialNumber;
        this.fuel = fuel;
        this.isRunning = false;
    }
    void start() {
        if (fuel > 0) {
            isRunning = true;
            System.out.println(brandName + " start");
        } 
        else 
            System.out.println("cant start");
        
    }
    void stop() {
        isRunning = false;
        System.out.println( " stopped");
    }

    void checkFuel() {
        System.out.println( fuel);
    }
}

 class Main {

    public static void main(String[] args) {
        Car car = new Car("Alex", "Toyota", "xy-3432", 1345);

        System.out.println("owner " + car.owner);
        System.out.println("band: " + car.brandName);
        System.out.println("serial  " + car.serialNumber);
        car.checkFuel();
        car.start();
        car.stop();
    }
}
