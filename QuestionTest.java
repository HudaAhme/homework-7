/**
 * Created by DELL on 20/10/2022.
 */
public class QuestionTest {
    public static void main(String[] args) {
       Question first=new Question();
        first.setText("what is ur name?");
        first.setAnswer("my name is Huda");
        Question second=new Question();
        second.setText("how are u?");
        second.setAnswer("Iam Ok.");

        boolean reasult=first.checkAnswer("Huda");
        System.out.println(first);
        System.out.println(second);

        System.out.println(  first.toString());
    }
}
