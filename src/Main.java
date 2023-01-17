import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main (String [] args) throws FileNotFoundException {
        // phase 1
        File filePhase1 = new File("phase-1.txt");
        ArrayList <Item> itemsPhase1 = Simulation.items(filePhase1);
        Simulation simulation1 = new Simulation();
        ArrayList <Rocket> rocketsU1Phase1 = new ArrayList<>();
        ArrayList <Rocket> rocketsU2Phase1 = new ArrayList<>();
        rocketsU1Phase1 = simulation1.loadU1(itemsPhase1);
        rocketsU2Phase1 = simulation1.loadU2(itemsPhase1);
        int costU1Phase1 = simulation1.runSimulation(rocketsU1Phase1);
        int costU2Phase1 = simulation1.runSimulation(rocketsU2Phase1);
        // phase 2
        File filePhase2 = new File("phase-2.txt");
        ArrayList <Item> itemsPhase2 = Simulation.items(filePhase2);
        Simulation simulation2 = new Simulation();
        ArrayList <Rocket> rocketsU1Phase2 = new ArrayList<>();
        ArrayList <Rocket> rocketsU2Phase2 = new ArrayList<>();
        rocketsU1Phase2 = simulation2.loadU1(itemsPhase2);
        rocketsU2Phase2 = simulation2.loadU2(itemsPhase2);
        int costU1Phase2 = simulation2.runSimulation(rocketsU1Phase2);
        int costU2Phase2 = simulation2.runSimulation(rocketsU2Phase2);
        //total
        int costU1total = costU1Phase1 + costU1Phase2;
        int costU2total = costU2Phase1 + costU2Phase2;
        System.out.println("Phase 1 - U1 rockets total cost: " + costU1Phase1);
        System.out.println("Phase 1 - U2 rockets total cost: " + costU2Phase1);
        System.out.println("Phase 2 - U1 rockets total cost: " + costU1Phase2);
        System.out.println("Phase 2 - U2 rockets total cost: " + costU2Phase2);
        System.out.println("The total cost of using U1 rockets is: " + costU1total + " million dollars");
        System.out.println("The total cost of using U2 rockets is: " + costU2total + " million dollars");
        if (costU1total > costU2total) {
            System.out.println("It's more profitable to use U2 rockets");
        } else if (costU2total > costU1total) {
            System.out.println("It's more profitable to use U1 rockets");
        } else {
            System.out.println("The cost is roughly the same");
        }
        }

    }
