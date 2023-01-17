public class U2 extends Rocket {
    U2() {
        cost = 120;
        weight = 18000;
        maxWeight = 29000;
        currentWeight = weight;
    }
    public boolean launch() {
        double num = Math.random() * 0.1;
        chanceOfLaunchExplosion = 0.04 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        if (num > this.chanceOfLaunchExplosion) {
            return true;
        }
        return false;
    }
    public boolean land() {
        double num = Math.random() * 0.1;
        chanceOfLandingCrash = 0.08 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        if (num > this.chanceOfLandingCrash) {
            return true;
        }
        return false;
    }
}