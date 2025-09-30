import java.util.*;
public class Stringopo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a program to reverse an String");
        System.out.print("Enter any String:-  ");
        String a = sc.nextLine();
        int b = a.length();
        for(int i=b-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }
        sc.close();
    }
}
