public class U2 extends Rocket {
    U2(double cargoCarried, double cargoLimit) {
        super();
        this.cost = 120_000_000;
        this.weight = 18_000;
        this.maxWeight = 29_000;
        this.chanceOfLaunchExplosion = 0.04 * (cargoCarried / cargoLimit);
        this.chanceOfLandingCrash = 0.08 * (cargoCarried / cargoLimit);
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