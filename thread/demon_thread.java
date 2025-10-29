package thread;

public class demon_thread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<10000;i++){
            System.out.println("Thrad");
        }
    }
    public static void main(String[] args) {
        demon_thread t1 = new demon_thread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("This is an program");
    }
}
