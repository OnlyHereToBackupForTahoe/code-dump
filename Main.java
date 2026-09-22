import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Hello, this is my first real Java program! I am learning and discovering new things! :0");
        String inp = read.nextLine();
        if (inp.equals("Cool!")){
            System.out.println("I know! You should try Java too!");
        }
        System.out.println("Bye! Hope you enjoyed my program! (rate it from 1 to 10)");
        int programRating = read.nextInt();
        if (programRating > 10){
            System.out.println("You love this program THAT much?! Thank you so much!");
        } else if (programRating < 6) {
            System.out.println("Oh, ok. I don't mind if you say it is bad.");
        } else if (programRating > 6 && programRating < 10) {
            System.out.println("Thank you.");
        }
    }
}