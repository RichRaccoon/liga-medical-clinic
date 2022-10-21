package liga.medical.medicalmonitoring.core.antisolid;

public class AntiO {
    // Bad
    public void sendMessage(String messageType, String message) {
        if (messageType.equals("email")) {
            System.out.println("send email message");
        } else if (messageType.equals("sms")) {
            System.out.println("send sms message");
        }
    }
}


// Good
interface NotificationService {
    void sendMessage(String message);
}

class EmailNotificationService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("send email message");
    }
}

class SMSNotificationService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("send sms message");
    }
}