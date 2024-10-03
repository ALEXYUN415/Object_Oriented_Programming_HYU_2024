package week14;
import java.io.*;
import java.net.*;

public class CalculatorClient {
    public static void main(String[] args) {
        try (BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
             Socket clientSocket = new Socket("localhost", 0415);
             DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
             BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String serverMessage;

            // Welcome message
            serverMessage = inFromServer.readLine();
            System.out.println(serverMessage);

            // Enter operation
            serverMessage = inFromServer.readLine();
            System.out.print(serverMessage);
            String operator = inFromUser.readLine();
            outToServer.writeBytes(operator + "\n");

            // Enter first number
            serverMessage = inFromServer.readLine();
            System.out.print(serverMessage);
            String num1 = inFromUser.readLine();
            outToServer.writeBytes(num1 + "\n");

            // Enter second number
            serverMessage = inFromServer.readLine();
            System.out.print(serverMessage);
            String num2 = inFromUser.readLine();
            outToServer.writeBytes(num2 + "\n");

            // Server response
            while ((serverMessage = inFromServer.readLine()) != null) {
                System.out.println(serverMessage);
            }

        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}