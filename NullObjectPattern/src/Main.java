public class Main {

    public static void main(String[] args) {
        Vehicle v = VehicleFactory.getVehicleObject("Truck");
        printVehicleDetails(v);
    }

    public static void printVehicleDetails(Vehicle v) {
        System.out.println("Seating Capacity: "+ v.getSeatCapacity());
        System.out.println("Tank Capacity: " +v.getTankCapacity());
    }
}