import java.util.*;

class Number {
    int value;
    Number(int value) {
        this.value = value;
    }
}

public class swap_two_number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is an Swapping nUmber program");
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+a +"\nb = "+b);
        sc.close();
        
    }
    static void swap(Number x, Number y) {
        int temp = x.value;
        x.value = y.value;
        y.value = temp;
    }
}