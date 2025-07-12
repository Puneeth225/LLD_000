public class Floor {

    int floorNumber;
    ExternalDispatcher externalDispatcher;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        externalDispatcher = new ExternalDispatcher();
    }

    public void pressButton(Direction dir) {
        externalDispatcher.submitExternalRequest(floorNumber, dir);
    }
}
