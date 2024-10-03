package week4;

public class LA2 {
    public static void main(String[] args) {


        String[] brandNames = {"Benz", "Hyundai"};
        String[] modelNames = {"C Class", "Sonata"};
        int[] prices = {55000000, 30000000};
        double[] mileages = {14.0, 12.0};
        String[] colors = {"Black", "blue"};

        Car[] carInformation = new Car[brandNames.length];

        for (int i = 0; i < brandNames.length; i++) {
            carInformation[i] = new Car();
            carInformation[i].brand = brandNames[i];
            carInformation[i].model = modelNames[i];
            carInformation[i].price = prices[i];
            carInformation[i].mileage = mileages[i];
            carInformation[i].color = colors[i];
        }

        for (int i = 0; i <brandNames.length ; i++) {
            System.out.println("Brand : " + brandNames[i]);
            System.out.println("Model name : " + modelNames[i]);
            System.out.println("Price : " + prices[i] + "KRW");
            System.out.println("Mileage : " + mileages[i] + "km/l");
            System.out.println("Color : " + colors[i]);
            System.out.println("\n\n");
            System.out.println();
        }
    }
}

class Car{
    String brand;
    String model;
    int price;
    double mileage;
    String color;
}

