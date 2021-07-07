package hw5;

import java.util.*;

public class Cinema {
    TreeMap<Days, Schedule> daysSchedules;
    Time open;
    Time close;

    public Cinema() {
        this.daysSchedules = new TreeMap<>();
        Days[] days = Days.values();
        for (Days day : days) {
            this.daysSchedules.put(day, new Schedule());
        }
    }

    public Cinema(Time open, Time close) {
        this.open = open;
        this.close = close;
        this.daysSchedules = new TreeMap<>();
        Days[] days = Days.values();
        for (Days day : days) {
            this.daysSchedules.put(day, new Schedule());
        }
    }

    public TreeMap<Days, Schedule> getDaysSchedules() {
        return daysSchedules;
    }


    public void setDaysSchedules(TreeMap<Days, Schedule> daysSchedules) {
        this.daysSchedules = daysSchedules;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    public void addSeance(String day, Seance seance) {
        final Set<Map.Entry<Days, Schedule>> entries = this.daysSchedules.entrySet();
        for (Map.Entry<Days, Schedule> entry : entries) {
            if (entry.getKey().toString().equalsIgnoreCase(day)) {
                if (seance.getStartTime().compareTo(this.open) > 0 && seance.getEndTime().compareTo(this.close) < 0) {
                    entry.getValue().addSeance(seance);
                } else {
                    System.out.println("Cinema is closed");
                }
            }
        }

    }

    public void addSeances(String day, ArrayList<Seance> seances) {
        final Set<Map.Entry<Days, Schedule>> entries = this.daysSchedules.entrySet();
        for (Map.Entry<Days, Schedule> entry : entries) {
            if (entry.getKey().toString().equalsIgnoreCase(day)) {
                for (Seance seance : seances) {
                    if (seance.getStartTime().compareTo(this.open) > 0 && seance.getEndTime().compareTo(this.close) < 0) {
                        entry.getValue().addSeance(seance);
                    } else {
                        System.out.println("Cinema is closed");
                    }

                }
            }
        }

    }

    public void removeSeance(String day, Seance seance) {

        final Set<Map.Entry<Days, Schedule>> entries = this.daysSchedules.entrySet();
        for (Map.Entry<Days, Schedule> entry : entries) {
            if (entry.getKey().toString().equalsIgnoreCase(day)) {
                entry.getValue().removeSeance(seance);
            }
        }

    }


    public void removeMovie(String movieTitle) {
        boolean isMoviePresent = false;
        final Set<Map.Entry<Days, Schedule>> entries = this.daysSchedules.entrySet();
        for (Map.Entry<Days, Schedule> entry : entries) {
            final boolean isRemoved = entry.getValue().removeByMovieTitle(movieTitle);
            if (isRemoved) {
                isMoviePresent = true;
                System.out.println("Movie " + movieTitle + " is remove from schedule on " + entry.getKey());
            }
        }
        if (!isMoviePresent) {
            System.out.println("Movie " + movieTitle + " isn't present on schedule ");
        }
    }

    @Override
    public String toString() {
        StringBuilder weekSchedule = new StringBuilder();
        final Set<Map.Entry<Days, Schedule>> entries = daysSchedules.entrySet();
        for (Map.Entry<Days, Schedule> entry : entries) {
            weekSchedule.append("\t").append(entry.getKey()).append(" ").append(entry.getValue());
        }

        return "\t\tCinema\n" +
                weekSchedule +
                "Cinema is opened at " + open +
                "\nCinema is closed at " + close;
    }


}
