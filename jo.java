import java.util.Scanner;
public class jo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number:- ");
        int S = sc.nextInt();
        if(S%2 == 0){
            System.out.println("This is Even Number");
        }
        else{
            System.out.println("This is odd Number");
        }
        sc.close();
    }
}
