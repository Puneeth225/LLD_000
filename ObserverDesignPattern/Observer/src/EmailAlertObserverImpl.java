public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product came in stock, Can buy now!!");
    }

    public void sendEmail(String emailId, String message){
        System.out.println("Email sent to: "+emailId);
    }
}
