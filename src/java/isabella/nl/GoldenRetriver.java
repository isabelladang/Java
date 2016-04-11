package isabella.nl;

/**
 * Created by dannytran on 4/4/16.
 */
public class GoldenRetriver implements Dog {
    private String name;
    private int age;
    private double notroundedage;
    private String color;

    public GoldenRetriver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int dang() {
        return age;
    }

    public void setAge(int ageInYears){
        age = ageInYears;
    }

}
