import java.util.Scanner;
public class NumberGuess{
        public static void main(String[] args) {
            int attempt=1;
            int noOfGuess=0,score=0;
            int originalNo=(int)(Math.random()*99+1);
            System.out.println("\t+---------------------------+");
            System.out.println("\t| ****************Welcome to Number Guessing Name********************|");
            System.out.println("\t+---------------------------+\n");
            System.out.println("*****Guess a Number between 1 to 100\n**********");
            Scanner a=new Scanner(System.in);
            while(true) {
                if(a.hasNextInt()) {
                    noOfGuess=a.nextInt();
                    if(noOfGuess==originalNo) {
                        score=score+10;
                        System.out.println("********** !Congratulation!! You Won The game..!!***************");
                        System.out.println(">>>Your score is"+" "+score);
                        System.out.println("You Guessed it in"+" "+attempt+" "+"attempts!");
                        break;
                    }
                    else if(noOfGuess<originalNo) {
                        System.out.println("Your Guess is too Small!");
                        System.out.println("-------------Keep Trying-------");
                        System.out.println("Attempts remaining="+(10-attempt));
                        score--;
                    }
                    else if(noOfGuess>originalNo) {
                        System.out.println("Your Guess is too High!");
                        System.out.println("-------------Keep Trying-------");
                        System.out.println("Attempts remaining="+(10-attempt));
                        score--;
                    }
                    if(attempt==10) {
                        System.out.println("You have Exceeded the Maximum number of attempts!!");

                        System.out.println("Better Luck Next Time!");
                        break;
                    }
                    attempt++;
                }
                else {
                    System.out.println("Enter a Valid Number!");
                }
            }
        }
    }

