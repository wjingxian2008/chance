
public class Chance {

    private float fraction;

    public Chance(){

    }

    public Chance(float fraction) {
        this.fraction = fraction;
    }

    public Chance not(Chance chance) {
        return new Chance(1 - chance.fraction);
    }

    public Chance and(Chance chanceA, Chance chanceB) {
        return new Chance(chanceA.fraction * chanceB.fraction);
    }

    public Chance or(Chance chanceA, Chance chanceB) {
        return new Chance(chanceA.fraction + chanceB.fraction - chanceA.fraction * chanceB.fraction);
    }
}
