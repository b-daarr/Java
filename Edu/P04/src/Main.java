import java.util.*;

public class Main {
    public static boolean Logic_Gates(boolean a, boolean b, String operator){
        return switch (operator) {
            case "and" -> a & b;
            case "or" -> a | b;
            case "nand" -> !(a & b);
            case "nor" -> !(a | b);
            case "xor" -> a ^ b;
            case "xnor" -> !(a ^ b);
            default -> throw new AssertionError();
        };
    }

    public static boolean BN(boolean b, String operator){
        return switch (operator) {
            case "not" -> !b;
            case "buffer" -> b;
            default -> throw new AssertionError();
        };
    }

    public static void main(String[] args) {
        // Logic Gates
        boolean opMode;

        Scanner Inputs = new Scanner(System.in);
        System.out.print("Binary {b} or Unary{u} ?: ");
        String mode = Inputs.next();
        mode = mode.toLowerCase();

        switch (mode) {
            case "b" -> opMode = true;
            case "u" -> opMode = false;
            default -> throw new IllegalStateException("Unexpected value: " + mode);
        }

        if (opMode) {
            System.out.print("Binary mode - Enter first logic: ");
            boolean i = Inputs.nextBoolean();
            System.out.print("Binary mode - Enter logic operator {and, or, nand, nor, xor, xnor}: ");
            String operator = Inputs.next();
            operator = operator.toLowerCase();
            System.out.print("Binary mode - Enter second logic: ");
            boolean o = Inputs.nextBoolean();
            System.out.print(Logic_Gates(i, o, operator));
        }
        else {
            System.out.print("Unary mode - Enter logic: ");
            boolean i = Inputs.nextBoolean();
            System.out.print("Unary mode - Enter logic operator {not, buffer}: ");
            String operator = Inputs.next();
            operator = operator.toLowerCase();
            System.out.print(BN(i, operator));
        }

        String exit = Inputs.nextLine();
        Inputs.close();
    }
}