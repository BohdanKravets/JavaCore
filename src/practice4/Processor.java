package practice4;

public class Processor {
    ProcessorType type;
    int coreNum;
    double frequency;
    Country country;

    public Processor() {
    }

    public Processor(ProcessorType type, int coreNum, double frequency, Country country) {
        this.type = type;
        this.coreNum = coreNum;
        this.frequency = frequency;
        this.country = country;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(int coreNum) {
        this.coreNum = coreNum;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public ProcessorType getType() {
        return type;
    }

    public void setType(ProcessorType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type=" + type +
                ", coreNum=" + coreNum +
                ", frequency=" + frequency +
                ", country=" + country +
                '}';
    }
}
