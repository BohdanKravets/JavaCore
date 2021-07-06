package hw5;

public class Time implements Comparable {
    private int hours;
    private int minutes;

    public Time() {
    }

    public Time(int hours, int minutes) {
        if((hours>=0 && hours<24) || (minutes>=0 && minutes<60) ) {
            this.hours = hours;
            this.minutes = minutes;
        }
        else {
            System.out.println("Wrong time");
        }

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours>=0 && hours<60 ) {
            this.hours = hours;
        }
        else {
            System.out.println("Wrong hours");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes>=0 && minutes<60 ) {
            this.minutes = minutes;
        }
        else {
            System.out.println("Wrong minutes");
        }
    }

    @Override
    public String toString() {
        return  this.hours +  " : " + this.minutes;
    }

    @Override
    public int compareTo(Object o) {
        Time t = (Time) o;
        if (this.getHours() - t.getHours() == 0) {
            return this.getMinutes() - t.getMinutes();
        }
        return this.getHours() - t.getHours();
    }
}


