import java.util.Scanner;

public class largest_of_three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("THis is the program to find the biggest number out of three number");
        System.out.print("Enter No.1 = ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number = ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd No. = ");
        int c = sc.nextInt();

        if (a>b){
            if(a>c){
                System.out.print("No.1 is the greatest No. out of all No.");
            }
            else if(a == c){
                System.out.print("No.1 is eqaul to Number 3 and greater than No. 2");
            }
            else{
                System.out.print("No.3 is the greatest No. out of all No.");
            }
        }
        else if(a == b){
            if (a>c){
                System.out.print("No.1 is eqaul to Number 2 and greater then No.3");
            }
            else if(a == c){
                System.out.print("All the given number are equal");
            }
            else{
                System.out.print("No.1 is eqaul to Number 2 and less then No.3");
            }

        }
        else{
            if(b>c){
                System.out.print("No.2 is the greatest No. out of all No.");
            }
            else if(b == c){
                System.out.print("No.2 is eqaul to Number 3 and greater than No.1");
            }
            else{
                System.out.print("No.3 is the greatest No. out of all No.");
            }
        }
        sc.close();
    }    
}
