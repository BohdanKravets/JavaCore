package hw5;

import java.util.*;

public class Cinema {
    TreeMap<Days, Schedule> daysSchedules;
    Time open;
    Time close;

    public Cinema() {
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
                }
                else {
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
                    }
                    else {
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
        final Set<Map.Entry<Days, Schedule>> entries = this.daysSchedules.entrySet();
        for (Map.Entry<Days, Schedule> entry : entries) {
            entry.getValue().removeByMovieTitle(movieTitle);
        }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "daysSchedules=" + daysSchedules +
                ", open=" + open +
                ", close=" + close +
                '}';
    }
}
