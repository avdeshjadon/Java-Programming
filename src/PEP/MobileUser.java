package PEP;

public class MobileUser {
    public static void main(String[] args) {
        Mobile mob = new Mobile("123456789", "Samsung", 15);
        Charger chg = new Charger("Type-C");
        mob.makeCall();
        mob.plugCharger(chg);
    }
}

class Mobile {
    final String imei;
    String mobileName;
    int percentage;
    Mobile(String imei, String mobileName, int percentage) {
        this.imei = imei;
        this.mobileName = mobileName;
        this.percentage = percentage;
    }
    void makeCall() {
        System.out.println("Making a call from " + mobileName);
    }
    void plugCharger(Charger charger) {
        if (percentage <= 20) {
            charger.charge();
        } else {
            System.out.println("Battery is sufficient, no need to charge.");
        }
    }
}


class Charger {
    String type;
    Charger(String type) {
        this.type = type;
    }
    void charge() {
        System.out.println("Charging using " + type + " charger.");
    }
}
