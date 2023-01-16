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
        ArrayList <Rocket> rockets = new ArrayList<>();
        return rockets;
    }
    public ArrayList<Rocket> loadU2 (ArrayList <Item> items) {
        ArrayList <Rocket> rockets = new ArrayList<>();
        return rockets;
    }
    public void runSimulation (Rocket [] rockets) {

    }
}
