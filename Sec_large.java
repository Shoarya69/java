import java.util.*;
public class Sec_large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        
        System.out.println("This is an Programm to Find Second largest element form an array");
        System.out.print("Number of element in your array = ");
        int b = sc.nextInt();
        int[] a = new int[b];
        for(int i=0;i<b;i++){
            System.out.print("Element "+(i+1)+"Value = ");
            a[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i=0;i<b-1;i++){
            if(a[i]>max){
                sec = max;
                max = a[i];
            }else if(a[i]>sec && a[i] != max){
                sec = a[i];
            }
            
        } 
        if(sec == Integer.MIN_VALUE){
                System.out.println("No second largest element exists");
        } else {
                System.out.println("Second largest element is: " + sec);
        }
        
        sc.close();
    }
}
