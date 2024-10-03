package week5;

import java.util.Scanner;

public class Rating {
    double rating;
    String reviewer;

    public double ratingPoint(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please put your name and rating for movie");
        System.out.println("Rating Details ");
        System.out.print("Rating: ");
        double rating = input.nextDouble();
        System.out.println();
        return rating;
    }
    public String reviewerName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Reviewer Name: ");
        String reviewer = input.nextLine();
        return  reviewer;
    }
}
