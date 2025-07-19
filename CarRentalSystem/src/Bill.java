public class Bill {

    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    Bill(Reservation reservation) {
        this.totalBillAmount = computeBillAmount();
        this.reservation = reservation;
        isBillPaid = false;
    }

    private double computeBillAmount(){
        return 175.5; //return bill amount;
    }
}
