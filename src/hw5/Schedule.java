package hw5;


import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private TreeSet<Seance> seanceList;

    public Schedule() {
        this.seanceList = new TreeSet<>();
    }


    public Set<Seance> getSeanceList() {
        return seanceList;
    }

    public void setSeanceList(TreeSet<Seance> seanceList) {
        this.seanceList = seanceList;
    }


    public void addSeance(Seance seance) {
        boolean flag = true;

        for (Seance s : this.seanceList) {
            if ((seance.getStartTime().compareTo(s.getStartTime()) > 0
                    && (seance.getStartTime().compareTo(s.getEndTime())) < 0) ||
                    ((seance.getEndTime().compareTo(s.getStartTime()) > 0
                            && (seance.getEndTime().compareTo(s.getEndTime())) < 0))
            ) {
                flag = false;
                break;
            }
        }
        if (flag) {
            this.seanceList.add(seance);

        } else {
            System.out.println("There cross with another movie");
        }
    }

    public boolean removeByMovieTitle(String movieTitle) {

        return this.seanceList.removeIf(seance -> seance.getMovie().getTitle().equals(movieTitle));

    }


    public void removeSeance(Seance seance) {

        if (this.seanceList.remove(seance)) {
            System.out.println("Seance is removed");
        } else {
            System.out.println("There no such seance");
        }

    }


    @Override
    public String toString() {
        StringBuilder seances = new StringBuilder();
        for (Seance seance : this.seanceList) {
            seances.insert(0, seance.toString());
        }
        return "Schedule:\n" + seances;

    }


}
