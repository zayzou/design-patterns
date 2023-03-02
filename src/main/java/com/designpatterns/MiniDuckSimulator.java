package com.designpatterns;

import com.designpatterns.duck.*;

public class MiniDuckSimulator {
    public static void main(String[] args) {
      Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPawered());
        modelDuck.performFly();


      System.out.println("============");
        DuckCall duckCall = new DuckCall();
        duckCall.setQuackBehavior(new Quack());
        duckCall.performQuack();
        duckCall.setQuackBehavior(new MuteQuack());
        duckCall.performQuack();
    }
}