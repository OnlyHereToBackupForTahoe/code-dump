import java.time.LocalTime;
import java.util.Scanner;


public class clockApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        String userInput = "";
        while (!userInput.equals("e")) {
            System.out.println("(S)topwatch or (T)ime? (type 'e' to exit)");
            userInput = read.nextLine();
            switch (userInput) {
                case "S":
                    int stopwatch = 0;
                    long time = 1000;
                    while (true) {
                        int i = 0;
                        System.out.println(stopwatch);
                        Thread.sleep(time);
                        stopwatch++;
                        while (i != 50) {
                            System.out.println(" ");
                            i++;
                        }
                    }
                case "T":
                    System.out.println(LocalTime.now());
                    break;
            }
        }
    }
}

