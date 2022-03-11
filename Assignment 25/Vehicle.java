public class Vehicle {
    private String registrationNumber = "";
    private String model = "";
    private double speed = 0.0;
    private static int numberOfVehicles = 0;

    public Vehicle(String number, String vehicleModel) {
        registrationNumber = number;
        model = vehicleModel;
        numberOfVehicles++;
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public double getSpeed() {
        return speed;
    }
}

public class Car extends Vehicle {
    private int numberOfPassengers = 0;

    public Car(String registrationNumber, String carModel) {
        super(registrationNumber, carModel);
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int passengers) {
        numberOfPassengers = passengers;
    }
}

public class Truck extends Vehicle {
    private int currentLoad = 0;

    public Truck(String registrationNumber, String truckModel) {
        super(registrationNumber, truckModel);
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int load) {
        currentLoad = load;
    }
}