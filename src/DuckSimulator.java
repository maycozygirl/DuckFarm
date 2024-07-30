import interfaces.Quackable;
import abstracts.*;
import decorators.*;



public class DuckSimulator {
    private AbstractDuckFactory factory;
    public DuckSimulator(AbstractDuckFactory factory) {
       this.factory = factory;
    }

    public static void main(String[] args) {
        AbstractDuckFactory factory = new PoliteWithCountDuckFactory();

        DuckSimulator simulator = new DuckSimulator(factory);
        simulator.simulate();
        
    }


    public void simulate() {
        Flock flockOfMallards = new Flock();
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());

        System.out.println("\nFlock of Mallard Ducks");
        simulate(flockOfMallards);

        Flock flockOfRedHeads = new Flock();
        flockOfRedHeads.add(factory.createRedHeadDuck());
        flockOfRedHeads.add(factory.createRedHeadDuck());
        flockOfRedHeads.add(factory.createRedHeadDuck());

        System.out.println("\nFlock of Red Head Ducks");
        simulate(flockOfRedHeads);

        System.out.println("Polite duck quacked: " + QuackCounter.getQuacks() + " times");
        
    }
    
    void simulate(Quackable duck) {
        duck.quack();
    }
}
