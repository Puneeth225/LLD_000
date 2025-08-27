public class Card {

    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;
    static int PIN = 123456;
    private UserBankAccount userBankAccount;

    public boolean isCorrectPinEntered (int pin) {
        if(pin == PIN) {
            return true;
        }
        return false;
    }

    public int getBankBalance() {
        return userBankAccount.balance;
    }

    public void deductBankBalance(int amount) {
        userBankAccount.withdrawalBalance(amount);
    }

    public void setBankAccount(UserBankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }
}
