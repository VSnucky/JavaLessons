public class Dog extends Animal{
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public boolean run(int r) {
        super.run(r);
        boolean b = false;
        if (r <= 500)
            b = true;
        System.out.println("Dog run: " + b);
        return b;
    }

    public boolean swim(int s) {
        boolean b = false;
        if(s <= 10)
            b = true;
        System.out.println("Dog swim: " + b);
        return b;
    }

    @Override
    public boolean jump(double j) {
        super.jump(j);
        boolean b = false;
        if (j <= 0.5)
            b = true;
        System.out.println("Dog jump: " + b);
        return b;
    }
}
