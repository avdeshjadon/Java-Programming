// Constructor with Default Fallbacks - Car Class Example
//
// Problem: Write a Java program to demonstrate constructor input validation with default fallback values.
// The Car class has three fields: make, model, and year.
// - If make or model is null or empty, default values are assigned.
// - If year is negative, it's defaulted to 2000.
//
// Approach: The program creates two Car objects:
//    1. With invalid input (to test fallback logic)
//    2. With valid input (to verify correct assignment)
//
// Sample Output:
// Make: Unknown Make
// Model: Unknown Model
// Year: 2000
// Make: Toyota
// Model: Corolla
// Year: 2022


package Practice;

class Car{
    private String make;
    private String model;
    private int year;


    public Car(String make, String model, int year){

        //make validation
        if(make==null||make.isEmpty()){
            this.make="unknown model";
        }else{
            this.model=model;
        }

        //model validation
        if(model==null||model.isEmpty()){
            this.model="Unknown model";
        }else{
            this.model=model;
        }

        //year validation
        if(year<0){
            this.year=2000;
        }else{
            this.year=year;
        }
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }



    //display function

    public void displayDeatils(){
        System.out.println("Make: "+getMake());
        System.out.println("Model: "+getMake());
        System.out.println("Year: "+getYear());
    }


}

public class Practice {
    public static void main(String[] args) {


        Car car1=new Car(""," ",-6);
        car1.displayDeatils();



        Car car2=new Car("Toyota","Corolla",2022);
        car2.displayDeatils();

    }
}

