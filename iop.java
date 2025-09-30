//Program to find an number is prime or not prime
import java.util.*;

public class iop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is program to find prime or non prime Number :  ");
        System.out.print("Enter the Number :- ");
        int a = sc.nextInt();
        Boolean j = true;
        for(int i=2;i<(a/2+1);i++){
            if(a%i==0){
                j = false;
                break;
            }
        }
        if(a<=1){
            j = false;
        }
        if(j){
            System.out.println("This give "+a+" is an Prime Number");
        }
        else{
            System.out.println("This give "+a+" is not a Prime Number");
        }
        sc.close();

    }
    
}
