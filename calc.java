import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String userInput = "placeholder";
        while (!userInput.equals("exit")) {
            int calcResult = 0;
            int calcNumber1 = 0;
            int calcNumber2 = 0;
            System.out.println("Type the calculation below... (example '1 + 1', cannot calculate more than 2 numbers right now due to the dev not knowing how :/) (type 'exit' to exit)");
            userInput = read.nextLine();
            String[] calculationSplit = userInput.split(" ");
            if(!calculationSplit[0].equals("exit")) {
                switch (calculationSplit[1]) {
                    case "*":
                        try {
                            calcNumber1 = Integer.parseInt((calculationSplit[0]));
                            calcNumber2 = Integer.parseInt((calculationSplit[2]));
                        } finally {
                            calcResult = calcNumber1 * calcNumber2;
                        }
                        break;

                    case "+":
                        try {
                            calcNumber1 = Integer.parseInt((calculationSplit[0]));
                            calcNumber2 = Integer.parseInt((calculationSplit[2]));
                        } finally {
                            calcResult = calcNumber1 + calcNumber2;
                        }
                        break;
                    case "-":
                        try {
                            calcNumber1 = Integer.parseInt((calculationSplit[0]));
                            calcNumber2 = Integer.parseInt((calculationSplit[2]));
                        } finally {
                            calcResult = calcNumber1 - calcNumber2;
                        }
                        break;
                    case "/":
                        try {
                            calcNumber1 = Integer.parseInt((calculationSplit[0]));
                            calcNumber2 = Integer.parseInt((calculationSplit[2]));
                        } finally {
                            calcResult = calcNumber1 / calcNumber2;
                        }
                        break;
                }
                System.out.println(userInput + " equals " + calcResult);
            }
        }
    }
}
