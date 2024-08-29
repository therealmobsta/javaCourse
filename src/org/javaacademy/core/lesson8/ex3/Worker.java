package org.javaacademy.core.lesson8.ex3;

/**
 * лесоруб
  */

public class Worker {
    private Axe axe;

    public Worker(Axe axe) {
        this.axe = axe;
    }

    public void chop() throws AxeIsBrokeException {
        if (axe.isBroken()) {
            throw new AxeIsBrokeException("Топор сломан!");
        }
    }
}
