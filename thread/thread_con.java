
public class thread_con {
    public static void main(String arg[]){
        thread t1 = new thread("fire","hello");
        thread t2 = new thread("base","world");
        t1.start();
        t2.start();
        System.out.println("\n"+t1.getName()+" "+t1.getState());
    }
}
