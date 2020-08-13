public class Plate {
    protected int food;
    protected int capacity;

    public Plate(int food, int capacity) {
        this.food = food;
        this.capacity = capacity;
    }

    public void increaseFood(int n) {
        if (capacity <= n) {
            food = capacity;
        }capacity += n;

    }
    public boolean decreaseFood(int n) {
        if (food <= n){
            return false;
        }food -= n;
        return true;
    }
    public void info(){
        System.out.println("In plate: " + food);
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
}
