public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategy = driveStrategyObj;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
