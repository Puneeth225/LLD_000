import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    static List<ElevatorController> elevatorControllerList = new ArrayList<>();
    static {
        ElevatorCar car1 = new ElevatorCar();
        car1.id = 1;
        ElevatorController controller1 = new ElevatorController(car1);

        ElevatorCar car2 = new ElevatorCar();
        car2.id = 2;
        ElevatorController controller2 = new ElevatorController(car2);

        elevatorControllerList.add(controller1);
        elevatorControllerList.add(controller2);
    }
}
