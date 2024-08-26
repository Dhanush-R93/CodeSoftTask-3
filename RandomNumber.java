import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        int count=0;
       int generatedNumber=generateNumber();
        checkNumber(generatedNumber,count);
    }
    static int generateNumber(){
        Random random=new Random();
        int generatedNumber= random.nextInt(100);
        System.out.println("Generated Number :"+generatedNumber);
        return generatedNumber;
    }
    static void checkNumber(int generatedNumber,int count){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int userNumber= sc.nextInt();

        if(generatedNumber==userNumber){
            System.out.println("You won");
            System.out.println("If you want to try again press 1 else 2");
            int userInput=sc.nextInt();
            if(userInput==1){
              generatedNumber=  generateNumber();
               checkNumber(generatedNumber,count=0);
            }
        }
        else {
            System.out.println("Fail");
           if(generatedNumber>=userNumber){
               System.out.println("too low");
           } else if (generatedNumber<=userNumber) {
               System.out.println("too high");
           }
            if(count<3){
                count++;
                checkNumber(generatedNumber,count);
            }
            else {
                System.out.println("If you want to try again press 1 else 2");
                int userInput=sc.nextInt();
                if(userInput==1){
                    generatedNumber=  generateNumber();
                    checkNumber(generatedNumber,count=0);
                }
                System.exit(0);
            }
        }
    }
}
