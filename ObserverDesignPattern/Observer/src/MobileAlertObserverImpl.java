public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String username;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String username, StockObservable observable){
        this.username = username;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        sendMsgonMobile(username,"Product came in stock, can buy now!!");
    }

    public void sendMsgonMobile(String username, String message){
        System.out.println("Mobile SMS Sent to: "+ username);
    }
}
