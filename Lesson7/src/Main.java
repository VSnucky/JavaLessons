public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Kiwi"), new Cat("Layza"), new Cat("Mila")
        };
        Plate plate = new Plate(50, 50);
        for (Cat cat : cats){
            cat.eat(plate, 20);
            System.out.println(cat);
        }
    }
}
