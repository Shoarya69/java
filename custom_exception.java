class ageistosmall extends Exception{
    public ageistosmall(String mess){
        super(mess);
    }
}

public class custom_exception {
    public static void main(String[] args) {
        int a = 12;
        if(a<18){
            try {
               throw new ageistosmall("You little shit want to give vote");
            } catch (ageistosmall e) {
            System.out.println(e.getMessage());
            }
         
        }
        else{
            System.out.println("You can vote");
        }
    }
    
}
