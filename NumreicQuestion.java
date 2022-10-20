/**
 * Created by DELL on 20/10/2022.
 */
public class NumreicQuestion extends Question {
    private double answer;
    public void setAnswer(double correctAnswer)
    {
        answer=correctAnswer;
    }
    public boolean checkAnswer(String respones)
    {
        double responesDoble=Double.parseDouble(respones);
        return Math.abs(responesDoble-answer)<=0.01;
    }
}
