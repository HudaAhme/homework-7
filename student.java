/**
 * Created by DELL on 20/10/2022.
 */
public class student extends person {
    private  String nth;

    public student(String n, int b,String l) {
        super(n, b);
        nth=l;
    }

    @Override
    public String toString() {
        return "student{" +
                "nth='" + nth + '\'' +
                '}';
    }
}
