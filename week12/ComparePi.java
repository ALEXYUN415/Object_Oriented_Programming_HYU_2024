package week12;
import java.io.*;


public class ComparePi {
    public static void main(String[] args) {
        try (
                BufferedReader originalReader = new BufferedReader(new FileReader("DeliciousPie.txt"));
                BufferedReader purifiedReader = new BufferedReader(new FileReader("PurifyPi.txt"))
        ) {
            boolean filesIdentical = true;
            String originalLine, purifiedLine;

            while ((originalLine = originalReader.readLine()) != null && (purifiedLine = purifiedReader.readLine()) != null) {
                if (!originalLine.equals(purifiedLine)) {
                    filesIdentical = false;
                    break;
                }
            }

            if (filesIdentical && originalReader.readLine() == null && purifiedReader.readLine() == null) {
                System.out.println("The files are identical.");
            } else {
                System.out.println("The files are not identical.");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
