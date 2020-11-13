package by.tsikunov.basics.controller;

import by.tsikunov.basics.model.Branching;
import by.tsikunov.basics.model.Cycle;
import by.tsikunov.basics.model.Linear;

public class Main {
    public static void main(String[] args) {
        Linear linearOperation = new Linear();
        Branching branchingOperation = new Branching();
        Cycle cycleOperation = new Cycle();

        System.out.println(cycleOperation.fifthTask());

        Integer x = new Integer(22);
        cycleOperation.sixthTask();
        if(null instanceof Integer) {
            System.out.println(true);
        } ;
    }
}
