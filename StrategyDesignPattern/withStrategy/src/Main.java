public class Main {
    public static void main(String []args){
        Vehicle v1 = new GoodsVehicle();
        v1.drive();

        Vehicle v2 = new SportsVehicle();
        v2.drive();
    }
}