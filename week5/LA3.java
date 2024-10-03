package week5;

public class LA3 {
    public static void main(String[] args) {
        Rating ratingEx = new Rating();
        ratingEx.rating= ratingEx.ratingPoint();
        ratingEx.reviewer= ratingEx.reviewerName();

        Movie movie = new Movie("Inception","Christopher Nolan",2010, ratingEx);
        movie.printMovieDetails(movie);

    }
}
