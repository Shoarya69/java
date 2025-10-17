public class finallykey {
    public static int divide(int a, int b) {
        try {
            return a/b;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        } finally {
            System.out.println("This is print by finally block");
        }
    }
    public static void main(String[] args) {
        
        int a=1,b=0;
        System.out.println("This is an finallly block use case program");
        System.out.println("Thr ab:- "+divide(a,b));
    }    
}
