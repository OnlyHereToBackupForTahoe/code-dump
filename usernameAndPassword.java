import java.io.*;
import java.nio.file.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class usernameAndPassword {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        String userInput = "";
        String webite = "";
        String username =  "nul";
        Boolean requestAppend = false;
        System.out.println("(R)equest or (A)ppend? ");
        userInput = read.nextLine();
        password();
        if(userInput.equals("R")){
            File fileToReadAndWrite = new File(userInput);
            Object[] lines = Files.readAllLines(Paths.get("/home/" + System.getProperty("user.name") + "/extraTaxes.txt")).toArray();
            if(lines[0] == ""){
                System.out.println("Type a password to unlock this vault: ");
                String append = read.nextLine();
                FileWriter fw = new FileWriter(fileToReadAndWrite, true);
                fw.append(((CharSequence) append));
                fw.close();
            } else {
                System.out.println("Type the password to unlock this vault: ");
                String check = read.nextLine();
                if(check.equals(lines[0])){
                    requestAppend = true;
                } else {
                    System.out.println("Wrong password.");
                }
            }
        } else {
            System.out.println("What username? ");
            username = read.nextLine();
        }
        System.out.println("What website? ");
        webite = read.nextLine();
        append(webite, username, output, requestAppend);
    }

    public static void append(String website, String username, String password, Boolean requestOrAppend) throws IOException {
        Scanner read = new Scanner(System.in);
        String userInput = "";
        while (!userInput.equals("e")) {
            Path fileToStorePasswords = Paths.get("/home/" + System.getProperty("user.name") + "/taxes.txt");
            if (Files.exists(fileToStorePasswords)) {
                File fileToReadAndWrite = new File("/home/" + System.getProperty("user.name") + "/taxes.txt");
                Object[] lines = Files.readAllLines(fileToStorePasswords).toString().replace("[", "").replace("]", "").split("⣚⇎ⶊ");
                String usernames = lines[0].toString();
                String websites = lines[1].toString();
                String passwords = lines[2].toString();
                List<String> usernameSplit = new ArrayList<>(Arrays.asList(usernames.split("▉⅖☡")));
                List<String> websiteSplit = new ArrayList<>(Arrays.asList(websites.split("▉⅖☡")));
                List<String> passwordSplit = new ArrayList<>(Arrays.asList(passwords.split("▉⅖☡")));
                if (requestOrAppend == true) {
                    System.out.println("Username : " + usernameSplit.get(websiteSplit.indexOf(website)) + "\n" + "Password : " + passwordSplit.get(websiteSplit.indexOf(website)));
                } else {
                    usernameSplit.add(username);
                    websiteSplit.add(website);
                    passwordSplit.add(password);
                    String append = "";
                    for (int i = 0; i < usernameSplit.size(); i++) {
                        append += usernameSplit.get(i) + "▉⅖☡";
                    }
                    append += "⣚⇎ⶊ";
                    for (int i = 0; i < websiteSplit.size(); i++) {
                        append += websiteSplit.get(i) + "▉⅖☡";
                    }
                    append += "⣚⇎ⶊ";
                    for (int i = 0; i < passwordSplit.size(); i++) {
                        append += passwordSplit.get(i) + "▉⅖☡";
                    }
                    FileWriter fw = new FileWriter(fileToReadAndWrite);
                    fw.write(append);
                    fw.close();
                }
            } else {
                Files.createFile(Paths.get("/home/" + System.getProperty("user.name") + "/taxes.txt"));
            }
            userInput = "e";
        }

    }
    static String output = "";
    public static void password() {
        SecureRandom passChar = new SecureRandom();
        int userInputLength = 16;
        Scanner reader = new Scanner(System.in);
        String[] chars = {"~", "`", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "+", "=", "{", "[", "}", "]", "|", "\\", ":", ";", "\"", "'", "<", ",", ">", ".", "?", "/", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        int charsOutputted = 0;
        while (charsOutputted != userInputLength) {
            String charSelected = chars[passChar.nextInt(chars.length)];
            output = output + charSelected;
            charsOutputted++;
        }
    }
}


