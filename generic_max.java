public class generic_max {
    public static <T extends Comparable<T>> void maxof(T a,T b,T c) {
        if(a.compareTo(b) > 0){
            if(a.compareTo(c) > 0){
                System.out.println(a+" This is the Greatest among all");
            }
            else{
                System.out.println(c+ " This is the Greatest among all");
            }
        }
        else{
            if(b.compareTo(c) > 0){
                System.out.println(b+" This is the greatest among all");
            }
            else{
                System.out.println(c+" This is the Greatest among all");
            }
        }
    }
    public static void main(String[] args) {
        maxof("hello", "5", "this is the way i am the iron man");
    }
    
}
