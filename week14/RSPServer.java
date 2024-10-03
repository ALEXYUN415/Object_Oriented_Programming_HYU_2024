package week14;

import java.io.*;
import java.net.*;
import java.util.Random;

public class RSPServer {
    public static void main(String[] args) {
        try (ServerSocket welcomeSocket = new ServerSocket(0415)) {
            System.out.println("Server is running...");
            while (true) {
                try (Socket connectionSocket = welcomeSocket.accept();
                     BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                     DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream())) {

                    outToClient.writeBytes("Enter your choice (rock, paper, scissors): \n");
                    String clientChoice = inFromClient.readLine().trim().toLowerCase();

                    if (!clientChoice.equals("rock") && !clientChoice.equals("paper") && !clientChoice.equals("scissors")) {
                        outToClient.writeBytes("Invalid input, please enter one of rock, paper, scissors\n");
                    } else {
                        String serverChoice = getServerChoice();
                        String result = determineWinner(clientChoice, serverChoice);

                        outToClient.writeBytes("Server chose: " + serverChoice + "\n");
                        outToClient.writeBytes(result + "\n");
                    }
                } catch (Exception e) {
                    System.out.println("Error handling client: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Could not start server: " + e.getMessage());
        }
    }

    private static String getServerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        return choices[random.nextInt(3)];
    }

    private static String determineWinner(String clientChoice, String serverChoice) {
        if (clientChoice.equals(serverChoice)) {
            return "It's a draw!";
        }
        if ((clientChoice.equals("rock") && serverChoice.equals("scissors")) ||
                (clientChoice.equals("scissors") && serverChoice.equals("paper")) ||
                (clientChoice.equals("paper") && serverChoice.equals("rock"))) {
            return "You win!";
        } else {
            return "You lose!";
        }
    }
}