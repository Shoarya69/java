public class  generic_programing {
    public static void main(String[] args){
        System.out.println(anti.abc("This"));
    }
}
class anti<T>{
    public static <T> T abc(T o){
        return o;
    }
}

