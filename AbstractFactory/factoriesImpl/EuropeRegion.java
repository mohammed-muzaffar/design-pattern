
public class EuropeRegion implements Factory {
    public Notification countryRegion(String type) {
        Notification notification = new EmailNotification();
        if (type == "UK") {
            System.out.println("Senting Email Notification " + notification);
        }
        return notification;
    }
}
