package thread;

public class sycn_thread extends Thread{
    private static int count;
    public sycn_thread(String name) {
        super(name);
    }
    @Override 
    public synchronized  void run(){
        System.out.print("This is an thread which is running");
        for(int i=0;i<10000;i++){
            synchronized (sycn_thread.class) {
                count++;    
            }
            
        }
    }
    public static void main(String[] args) {
        sycn_thread t1 = new sycn_thread("t1");
        sycn_thread t2 = new sycn_thread("t2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Value ;- "+count);
    }
}
