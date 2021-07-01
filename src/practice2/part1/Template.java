package practice2.part1;

public class Template {
   private String name;


   public Template(){}

    public Template(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Temaplate{" +
                "name='" + name + '\'' +
                '}';
    }
}
