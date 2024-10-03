package week6.LA1;

public class LA1 {
    public static void main(String[] args) {
        SharpPencil sharpPencil = new SharpPencil();
        sharpPencil.setAmount(100);
        sharpPencil.setWidth(2);
        System.out.println("SharpPencil Amount: " + sharpPencil.getAmount());
        System.out.println("SharpPencil Width: " + sharpPencil.getWidth());
        Ballpen ballpen = new Ballpen();
        ballpen.setAmount(150);
        ballpen.setColor("Blue");
        System.out.println("Ballpen Amount: " + ballpen.getAmount());
        System.out.println("Ballpen Color: " + ballpen.getColor());
        FountainPen fountainPen = new FountainPen();
        fountainPen.setAmount(200);
        fountainPen.setColor("Black");
        fountainPen.refill(300);
        System.out.println("FountainPen Amount: " + fountainPen.getAmount());
        System.out.println("FountainPen Color: " + fountainPen.getColor());
    }
}