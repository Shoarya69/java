import java.util.Scanner;

public class jok {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number a:- ");
        int a = sc.nextInt();
        System.out.print("Enter any number b:- ");
        int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("The a is = "+a);
        System.out.print("The b is = "+b);
        sc.close();
    }    
}
