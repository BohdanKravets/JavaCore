package practice4;

public class HardDrive {
    String model;
    HDType type;
    double volume;
    Country country;

    public HardDrive() {
    }

    public HardDrive(String model, HDType type, double volume, Country country) {
        this.model = model;
        this.type = type;
        this.volume = volume;
        this.country = country;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HDType getType() {
        return type;
    }

    public void setType(HDType type) {
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "model='" + model + '\'' +
                ", type=" + type +
                ", volume=" + volume +
                ", country=" + country +
                '}';
    }
}
