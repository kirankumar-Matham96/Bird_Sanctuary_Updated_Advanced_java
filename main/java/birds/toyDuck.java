package birds;

public class toyDuck extends Bird implements Flyable, Swimmable {
    static int count;
    
    @Override
    void incrementCount() {
        count++;
    }
    
    @Override
    void decrementCount() {
        while(count > 0)
            count--;
    }
    
    public int getCount() {
        return count;
    }
    
    @Override
    public void fly() {
        System.out.println("Toy duck can fly!");
    }
    
    @Override
    public void swim() {
        System.out.println("Toy duck can swim!");
    }
}
