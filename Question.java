import java.util.Scanner;

/**
 * Created by DELL on 20/10/2022.
 */
public class Question {
    private String text;
    private String Answer;
    public  Question(){}
    public void Question(Question p)
    {
        Scanner input=new Scanner(System.in);
        String respone=input.nextLine();

    }
    public void setText(String questionText)
    {
        text=questionText;
    }
    public void setAnswer(String correctresponse)
    {
        Answer=correctresponse;
    }
    public boolean checkAnswer(String reponse)
    {
        return reponse.equals(Answer);
    }
    public void display()
    {
        System.out.println(text);
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", Answer='" + Answer + '\'' +
                '}';
    }
}
