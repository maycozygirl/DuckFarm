

import java.util.ArrayList;
import java.util.List;

import interfaces.Quackable;


public class Flock implements Quackable{

    List<Quackable> quackers = new ArrayList<>();
    Quackable quacker;

    public void add(Quackable quackable) {
        if (quacker == null)
            quacker = quackable;
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        for (Quackable q : quackers) {
            if (q == quacker) {
                q.quack();
                q.quack();
                q.quack();
            }
            else
                q.quack();
        }
    }


}
