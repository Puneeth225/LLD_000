public class VehicleFactory {

    static Vehicle getVehicleObject(String vehicleType) {
        if("Car".equalsIgnoreCase(vehicleType)){
            return new Car();
        }
        return new NullVehicle();
    }
}
