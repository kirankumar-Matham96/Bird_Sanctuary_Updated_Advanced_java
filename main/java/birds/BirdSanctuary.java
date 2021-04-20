package birds;

import java.util.HashSet;

public class BirdSanctuary {
    private HashSet<Bird> birdSet = new HashSet<>();
    
    static BirdSanctuary instance;
    
    public HashSet<Bird> getBirdSet() {
        return birdSet;
    }
    
    synchronized public static BirdSanctuary getInstance() {
        if(instance == null) {
            instance = new BirdSanctuary();
        }
        return instance;
    }
    
    public boolean addBird(Bird bird) {
        try {
            if(bird == null) {
                throw new BirdSanctuaryAddException("Bird not exists!");
            }
            if(birdSet.add(bird)) {
                bird.incrementCount();
                return true;
            }
        } catch(BirdSanctuaryAddException e) {
            e.printStackTrace();
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void removeBird(Bird bird) {
        birdSet.remove(bird);
        bird.decrementCount();
    }
    
    public void printFlyable() {
        birdSet.stream().filter(bird -> bird instanceof Flyable)
               .forEach(bird -> ((Flyable) bird).fly());
    }
    
    public void printSwimmable() {
        birdSet.stream().filter(bird -> bird instanceof Swimmable)
               .forEach(bird -> ((Swimmable) bird).swim());
    }
    
    public void printEatable() {
        birdSet.stream().filter(bird -> bird instanceof Eatable)
               .forEach(bird -> ((Eatable) bird).eat());
    }
    
    public void printAllbirdsInSanctuary() {
        for(Object i : birdSet) {
            System.out.println(i);
        }
    }
}
