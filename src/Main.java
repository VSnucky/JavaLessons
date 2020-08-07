public class Main {

    public static void main(String[] args) {
        doCat();
        doDog();
    }
    public static void doCat(){
        Cat cat = new Cat("Kiwi", "Gray", 1);
        cat.run(55);
        cat.jump(1);
    }
    public static void doDog(){
        Dog dog = new Dog("Baks", "Black", 3);
        dog.run(320);
        dog.jump(0.2);
        dog.swim(5);
    }
}
