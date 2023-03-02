package com.designpatterns;

import com.designpatterns.duck.Duck;
import com.designpatterns.duck.FlyRocketPawered;
import com.designpatterns.duck.MallardDuck;
import com.designpatterns.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
      Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPawered());
        modelDuck.performFly();

    }
}