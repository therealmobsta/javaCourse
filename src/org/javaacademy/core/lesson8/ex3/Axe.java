package org.javaacademy.core.lesson8.ex3;

/**
 * Топор
 */
public class Axe {
    private boolean isBroken = true;

    public void broke() {
        isBroken = false;
    }

    public boolean isBroken() {
        return isBroken;
    }
}
