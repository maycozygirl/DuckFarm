package ducks;

import interfaces.Quackable;

public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("Kwak");
    }
}
