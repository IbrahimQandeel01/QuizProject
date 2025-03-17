public class Question {
    private int IdQuestion ;
    private String Que;
    private String opt1 ;
    private String opt2 ;
    private String opt3 ;
    private String opt4 ;
    private String answer ;


    public Question(int idQuestion, String que, String opt1, String opt2, String opt3, String opt4, String answer) {
        IdQuestion = idQuestion;
        Que = que;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return
                " IdQuestion=" + IdQuestion +
                "\n the Question is '" + Que + ' ' +
                "\n opt1= " + opt1 + ", \t" +
                " opt2= " + opt2 + ", \t" +
                " opt3= " + opt3 + ", \t" +
                " opt4= " + opt4 + " \t \n";
    }

    public int getIdQuestion() {
        return IdQuestion;
    }

    public String getQue() {
        return Que;
    }

    public String getOpt1() {
        return opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setIdQuestion(int idQuestion) {
        IdQuestion = idQuestion;
    }

    public void setQue(String que) {
        Que = que;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
