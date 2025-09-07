import java.util.Scanner;

public class WeightMachineImpl implements WeightMachine{

    private static double w;
    public static void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        w = sc.nextDouble();
    }

    @Override
    public double getWeightInPound() {
        return w;
    }
}
