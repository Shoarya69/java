
public class thread_prirorty extends Thread {

    public thread_prirorty(String name) {
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(this.getName());
        }
    }
    
    public static void main(String[] arg){
        thread_prirorty t1 = new thread_prirorty("t1");
        thread_prirorty t2 = new thread_prirorty("t2");
        thread_prirorty t3 = new thread_prirorty("t3");
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MIN_PRIORITY);
        t3.start();
        t1.start();
        t2.start();
        
    }

}
