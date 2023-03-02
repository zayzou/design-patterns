package com.designpatterns.duck;

public class FlyRocketPawered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I am flying with a rocket");
    }
}
