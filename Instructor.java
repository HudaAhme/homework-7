/**
 * Created by DELL on 20/10/2022.
 */
public class Instructor extends  person {
    private double salary;
    public Instructor(String n, int b ,double s) {
        super(n, b);
        salary=s;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                '}';
    }
}
