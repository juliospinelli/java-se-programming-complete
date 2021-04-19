package labs.pm.data;

public class Review {
    private Rating rating;
    private String comments;

    public Review(Rating rating, String comments) {
        this.rating = rating;
        this.comments = comments;
    }

    /**
     * @return the rating
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Review{rating=" + rating + ", comments=" + comments + '}';
    }
}
