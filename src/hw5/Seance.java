package hw5;

public class Seance implements Comparable<Seance> {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance() {
    }

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        int offsetHours = (this.startTime.getMinutes() + this.movie.getDuration().getMinutes()) / 60;
        int endTimeHours = this.startTime.getHours() + this.movie.getDuration().getHours() + offsetHours;
        int endTimeMinutes = (this.startTime.getMinutes() + this.movie.getDuration().getMinutes()) % 60;
        this.endTime = new Time(endTimeHours, endTimeMinutes);
    }


    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }


    @Override
    public String toString() {
        return "Movie Title: " + movie.getTitle() + ", startTime: " + startTime + ", endTime: " + endTime + "\n";

    }


    @Override
    public int compareTo(Seance s) {
        return s.startTime.compareTo(this.startTime);
    }
}
