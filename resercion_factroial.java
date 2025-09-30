import java.util.*;
public class resercion_factroial {
    public static long fact(int a){
        if(a == 0) return 1;
        return a*fact(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is an Programm to Find Factroial of any number:: ");
        System.out.print("Enter the Number:- ");
        int a = sc.nextInt();
        long b = fact(a);
        System.out.println("The Factorial of given Number is "+ b);
        sc.close();
    }
}
