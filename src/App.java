public class App {
    public static void main(String[] args) throws Exception {
        Reader reader = new Reader();
        //addtion
        int a = Methods.randInt(1,10);
        int b = Methods.randInt(1,10);
        int answer = reader.getInt("What is " + a + " + " + b + ": ");
        int score = 0;
        if (answer == a+b){
            score++;
            System.out.println("Nice Job! Your score is:" + score + "/1");
        } else{
            System.out.println("You got it wrong.  The answer was " + a+b + ".Your score is:" + score + "/1");
        }

        //subtraction

        a = Methods.randInt(10,100);
        double aD = (double)a/10;
        b = Methods.randInt(10,100);
        double bD = (double)b/10;
        double answerD = reader.getDouble("What is " + aD + " - " + bD + ": ");

        if (answerD == Methods.roundDouble(1, aD-bD)){
            score++;
            System.out.println("Nice Job. Your score is:" + score + "/2");
        } else{
            System.out.println("You got it wrong. The answer was " + Methods.roundDouble(1, aD-bD) + ". Your score is:" + score + "/2");
        }

        //multiplcation 
        a = Methods.randInt(1,10);
        b = Methods.randInt(1,10);
        answer = reader.getInt("What is " + a + " * " + b + ": ");

        if (answer == a*b){
            score++;
            System.out.println("Nice Job! Your score is:" + score + "/3");
        } else{
            System.out.println("You got it wrong. The answer was " + a*b + ". Your score is:" + score + "/3");
        }
        
        //division

        a = Methods.randInt(10,1000);
        aD = (double)a/10;

        b = Methods.randInt(10,100);
        bD = (double)b/10;

        answerD = reader.getDouble("What is " + aD + " / " + bD + "(round to one place past the decimal): ");
        if (answerD == Methods.roundDouble(1, aD/bD)){
            score++;
            System.out.println("Nice Job. Your score is:" + score + "/4");
        } else{
            System.out.println("You got it wrong. The answer was " + Methods.roundDouble(1, aD/bD) + ". Your score is:" + score + "/4");
        }

        //mod 
        a = Methods.randInt(1,10);
        b = Methods.randInt(1,10);
        answer = reader.getInt("What is " + a + " % " + b + ": ");

        if (answer == a%b){
            score++;
            System.out.println("Nice Job! Your score is:" + score + "/5");
        } else{
            System.out.println("You got it wrong. The answer was " + a%b + ".Your score is:" + score + "/5");
        }
        

    }
}
