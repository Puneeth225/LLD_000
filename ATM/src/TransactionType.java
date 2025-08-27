public enum TransactionType {

    CASH_WITHDRAW,
    BALANCE_CHECK;

    public static void shpwAllTransactionTypes() {
        for(TransactionType type : TransactionType.values()) {
            System.out.println(type.name());
        }
    }
}
