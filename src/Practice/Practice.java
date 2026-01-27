package Practice;

public class Practice {
    int modelYear;
    String  modelName;

    public Practice(int year, String name){
        modelYear=year;
        modelName=name;
    }

    public static void main(String[] args) {
        Practice myPractice =new Practice(2003, "mustang");
        String carName =myPractice.modelName;
        int carYear=myPractice.modelYear;
        System.out.println(carName+","+carYear);

    }
}

