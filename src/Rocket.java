public class Rocket implements SpaceShip {
    int cost;
    int weight;
    int maxWeight;
    double chanceOfLaunchExplosion;
    double chanceOfLandingCrash;
    int currentWeight;
    public boolean launch() {
        return true;
    }
    public boolean land() {
        return true;
    }
    public boolean canCarry(Item item) {
        if (this.currentWeight + item.weight > this.maxWeight) {
            return false;
        }
        return true;
    }
    public int carry (Item item) {
        this.currentWeight += item.weight;
        return this.currentWeight;
    }
}
