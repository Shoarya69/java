// lamda is a type of function which is used to create an smaller version of interface function those are pure abstract function and only have one methode in it.

interface fun{
    public void say();
}

public class lamda_function {
    public static void main(String[] args){
        // This is normal way to create that function of interface class 
        fun a = new fun(){
            public void say(){
                System.out.println("Saying hellow");
            }
        };
        a.say();
        // Now this is mentos way to create an function for this type of class 
        fun c = () -> System.out.println("This is hello by an mentos way");
        c.say();
    }
}
