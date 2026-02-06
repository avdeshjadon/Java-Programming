package PEP;

public class MahilaRakshashi {
    public static void main(String[] args) {
        Avdesh avdesh =new Avdesh();
        Girls g = avdesh.getGirl();
        g.Details();
    }
}

class Girls {
    String name;
    Long phoneNumber;
    int age;
    String address;

    void Details() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Avdesh {

    public Girls getGirl() {
        System.out.println("Avdesh is collecting the data");
        Girls girls = new Girls();
        girls.name = "Prachi";
        girls.address = "Dholpur Rajakhera";
        girls.phoneNumber = 9876543210L;
        girls.age = 21;

        return girls;
    }
}
