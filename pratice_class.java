import java.util.*;;


public class pratice_class {

    public class Car{
        public String Brand;
        public int price;

        public Car() {
            System.out.println("here is Car created");

        }
        public Car(String b,int p){
            this.Brand =b;
            this.price =p;
            System.out.println("Here is paratermized constructor is called");
        }
        
    }    

    public static void main(String[] args) {
        // Car bmw = new Car("bmw",85439);
        // System.out.println(bmw.Brand+" "+bmw.price);
        pratice_class outer = new pratice_class();
        Car bmw = outer.new Car("bmw",75824);
        System.out.println(bmw.Brand+" "+bmw.price);
    }
}
