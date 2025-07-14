import java.util.Scanner;

public class QuestionService {

   Question[] questions = new Question[5];
   String[] selectedAnswers = new String[5];
   Question[] questionList = QuestionList.getQuestionList();

   public Question[] generateRandomQuestions(){
      Question[] finalList = new Question[5];
      for(int i=0; i<5; i++){
         int randomNum = (int) (Math.random() * 10);
         finalList[i] = new Question(i+1, questionList[randomNum].getQuestion(), questionList[randomNum].getOptions(), questionList[randomNum].getAnswer());
      }
      return finalList;
   }

   public QuestionService(){

      questions = generateRandomQuestions();

      // questions[0] = new Question(1, questionList[9].getQuestion(), questionList[9].getOptions(), questionList[9].getAnswer());
      // questions[1] = new Question(2, questionList[1].getQuestion(), questionList[1].getOptions(), questionList[1].getAnswer());
      // questions[2] = new Question(3, questionList[2].getQuestion(), questionList[2].getOptions(), questionList[2].getAnswer());
      // questions[3] = new Question(4, questionList[3].getQuestion(), questionList[3].getOptions(), questionList[3].getAnswer());
      // questions[4] = new Question(5, questionList[4].getQuestion(), questionList[4].getOptions(), questionList[4].getAnswer());
      

   }
   
   public void playQuiz(){
      System.out.println("Let's Play the Quiz !!!");
      int i=0;
      for(Question q: questions){
        System.out.println("Question: " + q.getId());
        System.out.println(q.getQuestion());
        char op = 'a';
        for(String option: q.getOptions()){
         System.out.println((op++) + ".) " + option);
        }
        System.out.print("Your Answer is: ");
        Scanner sc = new Scanner(System.in);
        selectedAnswers[i++] = sc.nextLine();
      }

      i = 0;
      System.out.println("Quiz is ended. Here are your answers:");
      for(String select: selectedAnswers){
         System.out.println("Question " + (++i) + ": " + select);
      }
   }

   public void printScore(){
      int score = 0;
      for(int i=0; i<questions.length; i++){
         String answer = questions[i].getAnswer();
         if(selectedAnswers[i].equalsIgnoreCase(answer)){
            score += 1;
         }
      }
      
      String comment;

      if(score == 5){
         comment = "Congratulations !! Outstanding Performance. ";
      }
      else if(score >= 3){
         comment = "Keep it up !! Very Good Performance. ";
      }
      else{
         comment = "Try to practice more !! Better Luck Next Time. ";
      }
      System.out.println();
      System.out.println(comment + "Your score is: " + score);
   }

}
