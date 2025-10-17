import java.util.*;
public class exc {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("This is an exception handling program");
        System.out.print("Enter No.1:- ");
        a = sc.nextInt();
        System.out.print("Enter No.2:- ");
        b = sc.nextInt();
        try {
            System.out.println("The result is :- "+a/b);
        } catch (Exception e) {
            System.out.println(e.getMessage()+"error");
        }
        sc.close();

    }
}
