import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner Inputs = new Scanner(System.in);

        System.out.println("Hello World");
        System.out.println("New Line \n");
        System.out.println("Return \r");
        System.out.println("Tab \t");
        System.out.println("Backspace \b");
        System.out.println("Double qoute \"");
        System.out.println("qoute \'");
        System.out.println("Backslash \\");

        // Variavbles
        byte by = 10;
        short sh = 10;
        int i = 10;
        long l = 10;
        float f = 3.14f;
        double d = 3.14;
        boolean b = true;
        char c = 'a';
        String s = "Hi";
        var v = 10;
        // array
        int[] ArrayVar = {};

        // Decimals
        System.out.format("Number is %d", i);
        System.out.format("Number is %-,8d", i);
        // Floats
        System.out.format("Number is %-,8.2f", f);
        // Strings
        System.out.format("Number is %s", s);
        System.out.format("Number is " + b);

        String exit = Inputs.nextLine();
        Inputs.close();
    }
}