package week5;

public class Car {
    String model;
    String manufacturer;
    int year;

    Car(){
        this("","",0);
    }

    Car(String model,String manufacturer, int year){
        this.model=model;
        this.manufacturer=manufacturer;
        this.year=year;
    }

    Car(String model,String manufacturer){
        this.model=model;
        this.manufacturer=manufacturer;
        this.year=0;
    }

    public void carinfo() {
        System.out.println("Model: "+model+", Manufacturer: "+manufacturer+", Year: "+year);
    }

}