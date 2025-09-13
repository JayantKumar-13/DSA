import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];
    String selection[] = new String[5];
    public QuestionService(){
        questions[0] = new Questions(1, "Best language", "Cpp", "Java", "Pyhton", "C", "Java");
        questions[1] = new Questions(2, "Worst language", "Cpp", "Java", "Pyhton", "C", "Cpp");
        questions[2] = new Questions(3, "Size of int", "1", "2", "4", "6", "2");
        questions[3] = new Questions(4, "Is satyam gay", "Yes", "5000%", "Hell yes", "Obvio", "5000%");
        questions[4] = new Questions(5, "Heavy dev", "Abhi", "Krish", "Abhinav", "Ujjwal", "Abhinav");

    }
   
   
    public void displayQuestions(){
        int i = 0;
        for(Questions q : questions){
            System.out.println("Question no." + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }
        for(String s : selection){
            System.out.println(s);
        }
    }
    public void printScore(){
        int score = 0;
        for(int i =0;i<5;i++){
            Questions que = questions[i];
            String correct = que.getAnswer();
            String user = selection[i];
            if(correct.equals(user)){
                score++;
            }
        }
        System.out.println("your score is " + score);
    }
}
