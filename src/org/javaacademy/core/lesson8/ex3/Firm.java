package org.javaacademy.core.lesson8.ex3;

public class Firm {
    private Worker worker;

    public Firm(Worker worker) {
        this.worker = worker;
    }
    public void makeProfit() {
        try {
            worker.chop();
        } catch (AxeIsBrokeException e) {
            System.out.println("Не можем делать прибыль по причине:" + e.getMessage());
        }
    }
}
