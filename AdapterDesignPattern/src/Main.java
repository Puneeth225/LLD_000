public class Main {

    public static void main(String[] args) {
        WeightMachineImpl weightInPounds = new WeightMachineImpl();
        WeightMachineImpl.takeInput();
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weightInPounds);
        System.out.print("Weight in Kg: "+weightMachineAdapter.getWeightInKg());
    }
}
