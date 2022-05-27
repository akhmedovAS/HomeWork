public class Movie {
    String director;
    String title;
    double duration;

    Movie(String director, String title, double duration) {
        this.director = director;
        this.title = title;
        this.duration = duration;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public double getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }
}
