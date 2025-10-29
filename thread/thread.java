
public class thread extends Thread{
    private String s;
    thread(String name,String message){
        super(name);
        this.s = message;
    }
    
    @Override
    public void run(){
        for (;;){
            System.out.println(s);
        }
    }
}


