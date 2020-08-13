public class Cat {
    protected String name;
    protected int appetite;
    protected boolean satiety;

    public Cat(String name) {
        this.name = name;
    }
    public void eat(Plate p, int appetite){
        satiety = p.decreaseFood(appetite);
    }
    public boolean satiety(){
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
