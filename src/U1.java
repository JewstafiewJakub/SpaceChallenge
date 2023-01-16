import java.util.Random;

public class U1 extends Rocket {
    U1 (double cargoCarried, double cargoLimit) {
        super();
        this.cost = 100_000_000;
        this.weight = 10_000;
        this.maxWeight = 18_000;
        this.chanceOfLaunchExplosion = 0.05 * (cargoCarried / cargoLimit);
        this.chanceOfLandingCrash = 0.001 * (cargoCarried / cargoLimit);
    }
    public boolean launch() {
        double num = Math.random();
        if (num > this.chanceOfLaunchExplosion) {
            return true;
        }
        return false;
    }
    public boolean land() {
        double num = Math.random();
        if (num > this.chanceOfLandingCrash) {
            return true;
        }
        return false;
    }
}
