package com.boomberman.model.AI;

import java.util.Random;

public abstract class AI {
    protected int maxSteps;
    protected final Random random;

    public AI() {
        random = new Random();
    }

    public abstract int calculate();
}
