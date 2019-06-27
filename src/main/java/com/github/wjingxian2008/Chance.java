package com.github.wjingxian2008;

public class Chance {

    private float fraction;


    public Chance(float fraction) {
        this.fraction = fraction;
    }

    public Chance not() {
        return new Chance(1 - fraction);
    }

    public Chance and(Chance chanceAnd) {
        return new Chance(fraction * chanceAnd.fraction);
    }

    public Chance or(Chance chanceOr) {
        return new Chance(chanceOr.not().fraction * not().fraction).not();
    }
}
