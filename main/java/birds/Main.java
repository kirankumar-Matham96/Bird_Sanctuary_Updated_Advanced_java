package birds;

public class Main {
    public static void main(String[] args) {
        BirdSanctuary sanctuary = BirdSanctuary.getInstance();
        
        Bird duck = new Duck();
        Bird duck2 = new Duck();
        Bird parrot = new Parrot();
        Bird penguin = new Penguin();
        Bird toyDuck = new toyDuck();
        Bird toyDuck2 = new toyDuck();
        
        sanctuary.addBird(duck);
        sanctuary.addBird(duck2);
        sanctuary.addBird(duck2);
        sanctuary.addBird(duck2);
        parrot = null;
        sanctuary.addBird(parrot);
        sanctuary.addBird(penguin);
        sanctuary.addBird(toyDuck);
        sanctuary.addBird(toyDuck2);
        
        sanctuary.removeBird(toyDuck2);
        
        sanctuary.printFlyable();
        sanctuary.printSwimmable();
        sanctuary.printEatable();
        
        System.out.println("\nduck count: "+duck.getCount());
        System.out.println("parrot count: "+parrot.getCount());
        System.out.println("penguin count: "+penguin.getCount());
        System.out.println("toyduck count: "+toyDuck.getCount());
    
        sanctuary.printAllbirdsInSanctuary();
    }
}
