package hw5;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

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


    //не розумію чому не працює, не має додавати фільм якщо конфліктує з часом інших фільмів
    public void addSeance(Seance seance) {
        boolean flag = true;

        for (Seance s : this.seanceList) {
            if (seance.getStartTime().compareTo(s.getStartTime()) > 0 && seance.getEndTime().compareTo(s.getEndTime()) < 0) {
                flag = false;
                System.out.println("here");
                break;
            }
        }
        if (flag) {
            this.seanceList.add(seance);

        } else {
            System.out.println("There cross with another movie");
        }
    }

    public void removeByMovieTitle(String movieTitle) {

        this.seanceList.removeIf(seance -> seance.getMovie().getTitle().equals(movieTitle));
    }


    public void removeSeance(Seance seance) {

        this.seanceList.remove(seance);
    }


    @Override
    public String toString() {
        String seances = "";
        for (Seance seance : this.seanceList) {
            seances = seance.toString() + seances;
        }
        return "Schedule:\n" + seances;

    }


}
