/**
 * Created by DELL on 20/10/2022.
 */
public class person {
    private String name;
    private int birthday;
    public person(String n,int b)
    {
        name=n;
        birthday=b;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
