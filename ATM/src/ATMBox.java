public class ATMBox {
    ATM atm;
    User user;

    public static void main(String args[]) {

        ATMBox atmBox = new ATMBox();
        atmBox.initialize();

        atmBox.atm.printCurrentATMStatus();
        atmBox.atm.getCurrentATMState().insertCard(atmBox.atm, atmBox.user.card);
        atmBox.atm.getCurrentATMState().authenticatePin(atmBox.atm, atmBox.user.card, 123456);
        atmBox.atm.getCurrentATMState().selectOperation(atmBox.atm, atmBox.user.card, TransactionType.CASH_WITHDRAW);
//        atmBox.atm.getCurrentATMState().displayBalance(atmBox.atm, atmBox.user.card);
        atmBox.atm.getCurrentATMState().cashWithdrawal(atmBox.atm, atmBox.user.card, 2700);

        atmBox.atm.printCurrentATMStatus();


    }

    private void initialize() {

        //create ATM
        atm = ATM.getATMObject();
        atm.setAtmBalance(3500, 1,2,5);

        //create User
        this.user = createUser();
    }

    private User createUser(){

        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){

        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private UserBankAccount createBankAccount() {

        UserBankAccount bankAccount = new UserBankAccount();
        bankAccount.balance = 3000;

        return bankAccount;

    }


}
