package week12;
import java.io.*;


public class PurifyPi {
    public static void main(String[] args) {

        try (
                BufferedReader reader = new BufferedReader(new FileReader("StargazyPie.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("PurifyPi.txt"))
        ) {
            String line;

            StringBuilder purifiedPi = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                String purifiedLine = line.replaceAll("[\\n\\t\\sIl!]", "");
                purifiedPi.append(purifiedLine);
            }

            writer.write(purifiedPi.toString());
            System.out.println("Pi data purified successfully!");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}