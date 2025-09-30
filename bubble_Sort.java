import java.util.*;
public class bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is an Program to sort an arry");
        System.out.print("Enter the array Size = ");
        int b = sc.nextInt();
        int[] a = new int[b];
        for(int  i=0;i<b;i++){
            System.out.print("Enter the element "+i+1+" Value = ");
            a[i] = sc.nextInt();
        }
        for (int i=0;i<b-1;i++){
            for(int j=i+1;j<b;j++){
                if(a[i]>a[j]){
                    a[i] = a[i]^a[j];
                    a[j] = a[i]^a[j];
                    a[i] = a[i]^a[j];
                }
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
        sc.close();

    }
}
