package week14;

import java.io.*;
import java.net.*;

public class RSPClient {
    public static void main(String[] args) {
        try (BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
             Socket clientSocket = new Socket("localhost", 0415);
             DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
             BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            // Read and print the server's initial message
            String serverMessage = inFromServer.readLine();
            System.out.print(serverMessage);
            String userChoice = inFromUser.readLine();
            outToServer.writeBytes(userChoice + "\n");

            // Read and print the server's responses
            while ((serverMessage = inFromServer.readLine()) != null) {
                System.out.println(serverMessage);
            }

        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}