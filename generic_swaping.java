import java.util.Arrays;

public class generic_swaping {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        swapng.Swap(a,3,4);
        System.out.println(Arrays.toString(a));

        swapng.Swap(a,2,0);
        System.out.println(Arrays.toString(a));
    }
}
 class swapng <T> {
    public static <T> void Swap(T[] arr,int a,int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}