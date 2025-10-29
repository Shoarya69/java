import java.util.*;

public class throw_in {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:- ");
        int age = sc.nextInt();
        sc.close();
        if(age < 18){
            throw new ArithmeticException("you are too young to give vote");
        }        
        System.out.println("You are eligible to give vote");
    }
    
}
