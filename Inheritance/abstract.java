abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
     void sound(){
        System.out.println("Booooowwwwwwww");
    }
}

class Cat extends Animal{
     void sound(){
        System.out.println("Meeeeooooooowwwwwww");
    }
}

class Buffalo extends Animal{
     void sound(){
        System.out.println("Maaaeaaaeeeee");
    }

    public static void main(String args[]){
        Buffalo obj1 = new Buffalo();
        Cat obj2 = new Cat();
        Dog obj3 = new Dog();
        obj1.sound();
        obj2.sound();
        obj3.sound();

    }
}
