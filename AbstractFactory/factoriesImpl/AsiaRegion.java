public class AsiaRegion implements Factory {
    public Notification countryRegion(String type) {

        Notification notification = new SMSNotification();

        if (type == "india") {
            System.out.println("Senting SMS notification " + notification);
        }
        return notification;
    }
}
