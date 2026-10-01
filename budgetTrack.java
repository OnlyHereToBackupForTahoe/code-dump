import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class budgetTrack {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        Integer userInput = 0;
        Object moneyString = "";
        if (Files.readAllLines(Paths.get("/home/" + System.getProperty("user.name") + "/expensesAndBudget.txt")).toArray()[0].toString().equals("")) {
            System.out.println("What is your budget? \n>> ");
            try {
                moneyString = Integer.parseInt(read.nextLine());
            } catch (NumberFormatException o) {
                System.out.println("Not an int, defaulting to 0...");
            }
        }
        System.out.println("How much have you spent? \n>> ");
        try {
            userInput = Integer.parseInt(read.nextLine());
        } catch (NumberFormatException o) {
            System.out.println("Not an int, defaulting to 0...");
        }
        Files.readAllLines(Paths.get("/home/" + System.getProperty("user.name") + "/expensesAndBudget.txt")).toArray();
        File fileToReadAndWrite = new File("/home/" + System.getProperty("user.name") + "/expensesAndBudget.txt");
        Object[] lines = Files.readAllLines(Paths.get("/home/" + System.getProperty("user.name") + "/expensesAndBudget.txt")).toArray();
        moneyString = lines[0];
        Integer moneyToSpend = ((Integer) Integer.parseInt(moneyString.toString()));
        Integer append = moneyToSpend - userInput;
        FileWriter fw = new FileWriter(fileToReadAndWrite);
        fw.append(((CharSequence) append.toString()));
        fw.close();
        System.out.println("You now have " + append.toString());
    }
}
