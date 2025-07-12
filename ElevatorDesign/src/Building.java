import java.util.List;

public class Building {
    List<Floor> floorList;

    Building(List<Floor> floors){
        this.floorList = floors;
    }

    public void addFloor(Floor newFloor) {
        floorList.add(newFloor);
    }

    public void removeFloor(Floor removeFloor) {
        floorList.remove(removeFloor);
    }

    List<Floor> getAllFloorList() {
        return floorList;
    }
}
