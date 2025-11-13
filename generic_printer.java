public class generic_printer {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,45,6,32};
        new printer<>(a);
    }
}

class printer <T>{
    public <T> printer(T[] arr){
        for(T a : arr){
            System.out.println(a);
        }
    }
}
