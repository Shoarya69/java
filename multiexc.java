import java.util.*;

public class multiexc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a multiple catch block program");

        try {
            // Possible risky operations
            System.out.print("Enter a number: ");
            int a = sc.nextInt();        // can throw InputMismatchException

            int[] v = new int[1];
            v[3] = 3;                    // can throw ArrayIndexOutOfBoundsException

            int c = 3 / 0;               // can throw ArithmeticException
            System.out.println(c);

        } catch (InputMismatchException e) {
            System.err.println("Input type is invalid: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of range: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("You cannot divide by zero: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Some other error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
