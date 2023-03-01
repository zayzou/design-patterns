package com.designpatterns;

import com.designpatterns.duck.Duck;
import com.designpatterns.duck.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();


    }
}