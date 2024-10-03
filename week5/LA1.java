package week5;
public class LA1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carinfo();

        Car car2 = new Car("Model S", "Tesla");
        car2.carinfo();

        Car car3 = new Car("Sonata", "Hyundai", 2020);
        car3.carinfo();
    }
}