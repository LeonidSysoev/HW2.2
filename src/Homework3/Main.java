package Homework3;



public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);


        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",6);


        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStationInterface station = new ServiceStation();

        report(station, car, bicycle, truck);
        report(station, car2, bicycle2, truck2);

    }

    private static void report(ServiceStationInterface station, Car car, Bicycle bicycle, Truck truck) {
        station.check(car);
        station.check(bicycle);
        station.check(truck);
    }
}
