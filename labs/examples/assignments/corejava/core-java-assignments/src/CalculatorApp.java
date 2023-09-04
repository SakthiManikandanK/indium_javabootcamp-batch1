import java.util.Scanner;

public class CalculatorApp {
    static Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.println("Enter two Values A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Adding the given two numbers:" + c);
    }
    public void subtraction() {
        System.out.println("Enter two Values A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a - b;
        System.out.println("Subtracting the given two numbers:" + c);
    }
    public void multiply() {
        System.out.println("Enter two Values A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("Multiplying the given two numbers:" + c);
    }
    public void divide() {
        System.out.println("Enter two Values A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a / b;
        System.out.println("Dividing the given two numbers:" + c);
    }
    public static void main(String[] args) {

        CalculatorApp calc = new CalculatorApp();
        int i;
        do {
            System.out.println("Press Options for Operations" + "\n" +
                    "1 : Addition" + "\n" +
                    "2 : Subtraction" + "\n" +
                    "3 : Multiplication" + "\n" +
                    "4 : Division" + "\n" +
                    "5 : Exit");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    calc.add();
                    break;
                case 2:
                    calc.subtraction();
                    break;
                case 3:
                    calc.multiply();
                    break;
                case 4:
                    calc.divide();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Operation");
            }
        } while (i != 0);
    }
}



