import java.util.Scanner;
public class AsciiArt {
    public static void main(String[] args){
        Scanner readCanvasChanges = new Scanner(System.in);
        String[][] mainCanvas = {{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}};
        String userInput = "";
        while(!userInput.equals("exit")){
            System.out.println("Type the coordinates of the character (starting from 1 and ending at 10) and then the character you want to change it to (e. g. '2, 1, #') (type 'exit' to exit.)");
            loadCanvas(mainCanvas);
            userInput = readCanvasChanges.nextLine();
            if(!userInput.equals("exit")){
                int y = 0;
                int x = 0;
                String charToChange = "0";
                String[] userInputSplit = userInput.split(", ");
                try{
                    if(userInputSplit[2].length() == 1) {
                        if(Integer.parseInt(userInputSplit[1]) <= 10 || Integer.parseInt(userInputSplit[0]) <= 10){
                            y = Integer.parseInt(userInputSplit[0]) - 1;
                            x = Integer.parseInt(userInputSplit[1]) - 1;
                            charToChange = userInputSplit[2];
                        } else {
                            System.out.println("The index was out of range, not changing...");
                        }
                    } else {
                        System.out.println("Character was too long, not changing...");
                    }
                } catch (Exception e) {
                    System.out.println("The coordinates were typed wrong, not changing...");
                }
                mainCanvas[y][x] = charToChange;
            }
        }
        // The input to change 0, 1 (which is currently 0) to # would be "1, 2, #"
    }
    public static void loadCanvas(String[][] canvas){
        int loadY = 0;
        int loadX = 0;
        while(loadY != 10){
            while(loadX != 10){
                System.out.print(canvas[loadY][loadX]);
                loadX++;
            }
            loadY++;
            loadX = 0;
            System.out.println();
        }
    }
}