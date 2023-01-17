import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public static ArrayList <Item> items (File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList <Item> items = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] itemNameAndWeight = line.split("=");
            String name = itemNameAndWeight[0];
            int weight = Integer.parseInt(itemNameAndWeight[1]);
            Item item = new Item(name, weight);
            items.add(item);
        }
        return items;
    }
    public ArrayList<Rocket> loadU1 (ArrayList <Item> items) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket r = new U1();
        for (Item item : items) {
            if (r.canCarry(item)) {
                r.carry(item);
            } else {
                rockets.add(r);
                r = new U1();
                r.carry(item);
            }
        }
        return rockets;
    }
    public ArrayList<Rocket> loadU2 (ArrayList <Item> items) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket r = new U2();
        for (Item item : items) {
            if (r.canCarry(item)) {
                r.carry(item);
            } else {
                rockets.add(r);
                r = new U2();
                r.carry(item);
            }
        }
        return rockets;
    }
    public int runSimulation (ArrayList <Rocket> rockets) {
        int totalCost = 0;
        int numOfRockets = rockets.size() - 1;
        for (Rocket rocket : rockets) {
            if (!rocket.launch()) {
                numOfRockets += 1;
            }
            if (!rocket.land()) {
                numOfRockets += 1;
            }
        }
        for (int i = 0; i < numOfRockets; i++) {
            totalCost += rockets.get(0).cost;
        }
        return totalCost;
    }
}
