package PEP;

class PrintCardMachine{
    static void printCard(String name, long phone, String address){
        System.out.println("=== Printing card with Below details ===");
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
        System.out.println("Address: "+address);
    }

    static void printCard(String name, long phone, String address,char blood_group){

        System.out.println("=== Printing card with Below details ===");
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
        System.out.println("Address: "+address);
        System.out.println("Blood Group: "+blood_group);
    }

    static void printCard(String name, long phone, String address,char blood_group,int age){
        System.out.println("=== Printing card with Below details ===");
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
        System.out.println("Address: "+address);
        System.out.println("Blood Group: "+blood_group);
        System.out.println("Age: "+age);
    }
}

public class PrintingCard {
          static void main(String[] args) {
        PrintCardMachine.printCard("avdesh",6201979695L,"Agra");
        PrintCardMachine.printCard("avdesh",6201979695L,"Agra",'B');
        PrintCardMachine.printCard("avdesh",6201979695L,"Agra",'B',22);
    }
}
