    class animal{
        void sleep(){
            System.out.println("Animal is Sleeping");
        }
        void eat(){
            System.out.println("Animal is eating");
        }
    }

    class dog extends animal{
        void bark(){
            System.out.println("Dog is barking");
        }
    }

    class cat extends animal{
        void meow(){
            System.out.println("Cat is meowing");
        }
    }

    class persion_cat extends cat{
        void furr(){
            System.out.println("Pursion cat furr is white");
        }
    }
    


    public class pratice_inheratince {
        public static void main(String[] args) {
            cat c1 = new cat();
            c1.eat();
            c1.meow();
            persion_cat c2 = new persion_cat();
            c2.furr();
            c2.eat();

        }    
    }
