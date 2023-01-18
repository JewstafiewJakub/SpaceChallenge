import java.util.Random;

public class U1 extends Rocket {
    U1 () {
        super();
        cost = 100_000_000;
        weight = 10000;
        maxWeight = 18000;
        currentWeight = weight;
    }
    public boolean launch() {
        double num = Math.random() * 0.1;
        chanceOfLaunchExplosion = 0.05 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        if (num > chanceOfLaunchExplosion) {
            return true;
        }
        return false;
    }
    public boolean land() {
        double num = Math.random() * 0.1;
        chanceOfLandingCrash = 0.05 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        if (num > chanceOfLandingCrash) {
            return true;
        }
        return false;
    }
}
