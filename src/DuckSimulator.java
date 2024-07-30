import interfaces.Quackable;
import adapters.*;
import decorators.*;
import ducks.*;
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new PoliteQuack(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new PoliteQuack(new GooseAdapter(new Goose()));
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        
        System.out.println("\nDuck Simulator: With Goose Adapter");
        
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);
        

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }
    
    public static void simulate(Quackable duck) {
        duck.quack();
    }
}
