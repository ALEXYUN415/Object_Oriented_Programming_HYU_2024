package week5;

public class Movie {

    String title;
    String director;
    int year;
    Rating rating;
    String reviewer;

    Movie(String title, String director, int year, Rating rating){
        this.title=title;
        this.director=director;
        this.year=year;
        this.rating=rating;
    }
    public void printMovieDetails(Movie movie){
        System.out.println("Movie Details:");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
        System.out.println("Rating: " + rating.rating);
        System.out.println("Reviewer: " + rating.reviewer);
    }

}
