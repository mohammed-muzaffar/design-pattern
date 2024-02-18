public class NotificationFactory {

    Notification notification;

    public Notification factoryMehtod(String type) {

        if (type == "SMS") {
            notification = new SMSNotification();
        } else if (type == "Email") {
            notification = new EmailNotification();
        } else if (type == "Push") {
            notification = new PushNotification();
        } else {
            throw new IllegalArgumentException();
        }

        return notification;
    }
}
