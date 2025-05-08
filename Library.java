import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    public HashMap contents() {
        HashMap games  = new HashMap();
        ArrayList<String> lst = new ArrayList<>();
        lst.add("Elden Ring"); //name
        lst.add("RPG");        //genre
        lst.add("2022");        //release
        games.put("1",lst);

        lst = new ArrayList<>();
        lst.add("Hollow Knight");
        lst.add("Metroidvania");
        lst.add("2017");
        games.put("2",lst);

        lst = new ArrayList<>();
        lst.add("Stardew Valley");
        lst.add("Simulation");
        lst.add("2016");
        games.put("3",lst);

        lst = new ArrayList<>();
        lst.add("Overwatch 2");
        lst.add("FPS");
        lst.add("2022");
        games.put("4",lst);

        lst = new ArrayList<>();
        lst.add("Valorant");
        lst.add("FPS");
        lst.add("2020");
        games.put("5",lst);

        lst = new ArrayList<>();
        lst.add("Rocket League");
        lst.add("sports");
        lst.add("2015");
        games.put("6",lst);

        return games;

    }
}
