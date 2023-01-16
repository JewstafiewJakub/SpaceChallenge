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
        if (this.weight + item.weight > this.maxWeight) {
            return false;
        }
        return true;
    }
    public int carry (Item item) {
        return this.currentWeight += item.weight;
    }
}
