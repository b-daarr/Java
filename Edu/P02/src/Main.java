import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inputs = new Scanner(System.in);
        int i = Inputs.nextInt();

        System.out.format("Number is %d\n", i);

	Inputs.nextLine("Press any key to continue...");
	Inputs.close();
    }
}