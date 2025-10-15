import java.util.*;
public class patterm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int i = sc.nextInt();
        for(int j=0;j<i;j++){
            for(int k=0;k<i;k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println("");

        for(int j=0;j<i;j++){
            for(int k=0;k<j;k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int j=0;j<i;j++){
            for(int k=0;k<i-j-1;k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println("");
        
        sc.close();
    }
}
