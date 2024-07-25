import java.util.*;

public class P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // if, else if, else
        if (number % 2 == 0){
            System.out.println("Even number");
        } else if (number % 2 == 1) {
            System.out.println("Odd number");
        }
        else {
            System.out.println("Error");
        }

        // try, catch, finally
        try {
            System.out.println(number);
        }
        catch (Exception e) {
            System.out.println("An error occurred");
        }
        finally {
            System.out.println("Process was completed");
        }

        // for, while, do while
        boolean key = true;

        for (int i = 0; i <= 10; i++) {
            System.out.println("The number is: " + i);
        }

        char[] test = {'a', 'b', 'c', 'd', 'e', 'f'};

        for (char c : test) {
            if (c == 'f'){
                System.out.println("The number is: " + c);
            }
        }

        while (key){
            System.out.print("Enter x for exit");
            char x = input.next().charAt(0);
            if (x == 'x' || x == 'X'){
                key = false;
            }
        }

        // switch

        double fno = input.nextDouble();
        char operator = input.next().charAt(0);
        double sno = input.nextDouble();

        // + Regular mode

       /* double result = 0;
        switch (operator) {
            case '+':
                result = (fno + sno);
                break;
            case '-':
                result = (fno - sno);
                break;
            case '*':
                result = (fno * sno);
                break;
            case '/':
                result = (fno / sno);
                break;
            case '%':
                result = (fno % sno);
                break;
            case '^':
                result = Math.pow(fno, sno);
                break;
            default:
                result = 0.0;
        } */

        // Enhanced mode

        double result = switch (operator) {
            case '+' -> (fno + sno);
            case '-' -> (fno - sno);
            case '*' -> (fno * sno);
            case '/' -> (fno / sno);
            case '%' -> (fno % sno);
            case '^' -> Math.pow(fno, sno);
            default -> 0;
        };

        System.out.println(result);

        int a1 = 10;
        int b1 = a1++;
        int b2 = ++a1;

        System.out.printf("%d  %d", b1, b2);
    }
}