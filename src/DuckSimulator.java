import interfaces.Quackable;
import abstracts.AbstractDuckFactory;
import abstracts.CountingDuckFactory;
import adapters.*;
import decorators.*;
import ducks.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new PoliteQuack(new GooseAdapter(new Goose()));
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        
        System.out.println("\nDuck Simulator: With Abstract Factory");
        
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);
        
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }
    
    void simulate(Quackable duck) {
        duck.quack();
    }
}
