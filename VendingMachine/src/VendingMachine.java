import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private MachineStates vendingMachineState;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine() {
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();
    }

    public MachineStates getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(MachineStates vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
