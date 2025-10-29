package thread;

public class implement_runnable implements Runnable{
    @Override
    public void run(){
        System.out.println("this is an thread create by runnable interface");
    }

    public static void main(String[] arg){
        implement_runnable task = new implement_runnable();
        Thread t1 = new Thread(task,"fire");
        t1.start();
    }
    
}
