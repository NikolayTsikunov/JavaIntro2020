package by.tsikunov.basics.controller;

import by.tsikunov.basics.model.Branching;
import by.tsikunov.basics.model.Loop;
import by.tsikunov.basics.model.Linear;

public class Main {
    public static void main(String[] args) {
        Linear linearOperation = new Linear();
        Branching branchingOperation = new Branching();
        Loop loopOperation = new Loop();

        System.out.println(loopOperation.eighthTask());

    }
}
