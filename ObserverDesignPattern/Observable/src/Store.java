public class Store {
    public static void main(String []args) {
        StockObservable iphone = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com",iphone);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("def@yahoo.in",iphone);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("user1",iphone);
        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);
        iphone.setStockCount(10); //if stock count increases it will notify
//        iphone.notifySubscribers();
    }
}
