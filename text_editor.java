import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class text_editor {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        String userInput = "";
        while (!userInput.equals("exit")) {
            System.out.println("What is the path of the file to read/write? (type 'exit' to exit)");
            userInput = "";
            userInput = read.nextLine();
            if (Files.exists(Paths.get(userInput))) {
                File fileToReadAndWrite = new File(userInput);
                Object[] lines = Files.readAllLines(Paths.get(userInput)).toArray();
                int linesToPrint = lines.length;
                int lineCount = 0;
                System.out.println("What would you like to append?");
                while (lineCount != linesToPrint) {
                    System.out.println(lines[lineCount]);
                    lineCount++;
                }
                String append = read.nextLine();
                FileWriter fw = new FileWriter(fileToReadAndWrite, true);
                fw.append(((CharSequence) append));
                fw.close();
            }
        }

    }
}

