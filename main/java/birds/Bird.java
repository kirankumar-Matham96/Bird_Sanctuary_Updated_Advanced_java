package birds;

public abstract class Bird {
    abstract void incrementCount();
    abstract void decrementCount();
    abstract int getCount();
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
