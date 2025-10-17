import java.util.*;
public class arrayexc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This index out of bound error in java program");
        int[] a = new int[3];
        System.out.print("No. of elements you guss in this array:- ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            try {
                System.out.print("This is an element "+i +"Enter the value of this element:- ");
                a[i] = sc.nextInt();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        sc.close();
        System.out.println("----->>>end<<<-----");

    }
    
}
