package Lab14;
//model class

public class Movie{
    private int year;
    private double rating;
    private double duration;
    private String title;

    public Movie(int year, double rating, double duration, String title) {
        this.year = year;
        this.rating = rating;
        this.duration = duration;
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public int compareTo(Movie movie){
//        if(this.year > movie.year) return 1;
//        else if(this.year < movie.year) return -1;
//        else return 0;
//    }

//    public int compareTo(Movie movie){
//        return this.year - movie.year;
//    }

//    public int compareTo(Movie movie){
//        if(this.rating > movie.rating) return 1;
//        else if(this.rating < movie.rating) return -1;
//        else return 0;
//    }

}
