import java.util.*;
public class random_maze {
    public static void main(String[] args) {
        String userInput = "";
        Random rnd = new Random();
        Scanner readUserInput = new Scanner(System.in);
        while(!userInput.equals("exit")){
            int horizontal = 0;
            int vertical = 0;
            int horizontalCount = 0;
            int verticalCount = 0;
            System.out.println("Random maze generator! (press enter to continue and type 'exit' to exit) ");
            userInput = readUserInput.nextLine();
            if(!userInput.equals("exit")){
                System.out.println("Type how big you want your maze to be (e. g '4 x 7') ");
                userInput = readUserInput.nextLine();
                String[] userInputSplit = userInput.split(" x ");
                try{
                    horizontal = Integer.parseInt(userInputSplit[0]);
                    vertical = Integer.parseInt(userInputSplit[1]);

                } catch (NumberFormatException e) {
                    System.out.println("You have inputted the layout wrong!");
                }
                while(verticalCount != vertical){
                    while(horizontalCount != horizontal){
                        int slashOrBack = rnd.nextInt(2);
                        if(slashOrBack == 0){
                            System.out.print("\\");
                        }else{
                            System.out.print("/");
                        }
                        horizontalCount++;
                    }
                    System.out.println();
                    verticalCount++;
                    horizontalCount = 0;
                }
            }
        }
    }
}
