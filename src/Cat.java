public class Cat extends Animal{
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public boolean run(int r) {
        super.run(r);
        boolean b = false;
        if (r <= 200)
            b = true;
        System.out.println("Cat run: " + b);
        return b;
    }

    @Override
    public boolean jump(double j) {
        super.jump(j);
        boolean b = false;
        if (j <= 2)
            b = true;
        System.out.println("Cat jump: " + b);
        return b;
    }
}
