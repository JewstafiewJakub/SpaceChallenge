import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main (String [] args) throws FileNotFoundException {
        File file = new File("phase-1.txt");
        ArrayList <Item> items = Simulation.items(file);
        }
    }
