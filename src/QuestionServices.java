import java.util.Scanner;

public class QuestionServices {
    Question questions []= new Question [5];
    public QuestionServices () {

            questions[0] = new Question(1,"how old are you ? "
                    ,"3","10","18","20","18");
            questions[1] = new Question(2,"how old are you ? "
                    ,"3","10","18","20","18");
            questions[3] = new Question(4,"how old are you ? "
                    ,"3","10","18","20","18");
            questions[4] = new Question(5,"how old are you ? "
                    ,"3","10","18","20","18");
            questions[2] = new Question(3,"how old are you ? "
                    ,"3","10","18","20","18");

    }
    public void playQuiz (){
        int answers[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(questions[i]);
            Scanner s = new Scanner (System.in) ;
            answers[i] = s.nextInt() ;
        }

        int score = 0;
        for (int i = 0; i < 5 ; i++ ){
                if (answers[i] == Integer.parseInt(questions[i].getAnswer()) ) {
                score++;
            }
        }

        System.out.println(" you score = "+ score + "/5");

    }
}
