package week14;
import java.io.*;
import java.net.*;

public class CalculatorServer {
    public static void main(String[] args) {
        try (ServerSocket welcomeSocket = new ServerSocket(0415)) {
            System.out.println("Server is running...");
            while (true) {
                try (Socket connectionSocket = welcomeSocket.accept();
                     BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                     DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream())) {

                    outToClient.writeBytes("Welcome to our calculation server!\n");
                    outToClient.writeBytes("Enter operation (+, -, *, /): \n");
                    String operator = inFromClient.readLine().trim();

                    outToClient.writeBytes("Enter first number: \n");
                    double num1 = Double.parseDouble(inFromClient.readLine().trim());

                    outToClient.writeBytes("Enter second number: \n");
                    double num2 = Double.parseDouble(inFromClient.readLine().trim());

                    double result = 0;
                    boolean error = false;
                    String errorMessage = "";

                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                error = true;
                                errorMessage = "Error: Division by zero.";
                            } else {
                                result = num1 / num2;
                            }
                            break;
                        default:
                            error = true;
                            errorMessage = "Invalid operator. Use one of +, -, *, /.";
                            break;
                    }

                    if (error) {
                        outToClient.writeBytes("FROM SERVER: " + errorMessage + "\n");
                    } else {
                        outToClient.writeBytes("FROM SERVER: Result: " + result + "\n");
                    }
                } catch (Exception e) {
                    System.out.println("Error handling client: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Could not start server: " + e.getMessage());
        }
    }
}