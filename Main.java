import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Please enter your name: ");
        Scanner usernameInput = new Scanner(System.in);
        String name = usernameInput.next();

        System.out.println("What Platform do you use: ");
        System.out.println("1. PC");
        System.out.println("2. XBOX");
        Scanner userPlatformInput = new Scanner(System.in);
        int userPlatform = userPlatformInput.nextInt();
        String userPlatformName = "";

        if (userPlatform == 1) {
            userPlatformName = "PC";
        } else if (userPlatform == 2) {
            userPlatformName = "XBOX";
        }

        UserProfile user = new UserProfile(name, userPlatformName);
        boolean running = true;
        while (running) {
            String options = "Choose an option: ";
            System.out.println(options);
            System.out.println("1. SinglePlayer");
            System.out.println("2. MultiPlayer");
            System.out.println("3. Quit");

            Scanner option = new Scanner(System.in);
            int optionSelected = option.nextInt();
            switch (optionSelected) {
                case 1:
                    System.out.println("Single player games");
                    System.out.println("1. Elden Ring");
                    System.out.println("2. Hollow Knight");
                    System.out.println("3. Stardew Valley");
                    break;
                case 2:
                    System.out.println("Multi player games");
                    System.out.println("4. Overwatch 2");
                    System.out.println("5. Valoran");
                    System.out.println("6. Rocket League");

                    break;
                case 3:
                    System.out.println("Quit");
                    running = false;
                    break;
                default:
                    break;
            }
            System.out.println("Choose a game by number:");
            Scanner chooseGame = new Scanner(System.in);
            String chosenIndex = chooseGame.next();
            HashMap games = new Library().contents();
            ArrayList<String> values = (ArrayList) games.get(chosenIndex);
            if (optionSelected == 1) {
                String a = values.get(0);
                String b = values.get(1);
                int c = Integer.valueOf(values.get(2));
                String dev = "FromSoftware";
                AbstractGame game = new SinglePlayerGame(a, b, userPlatformName, c, dev);
                game.printGameDetails();
                
            }
            // ArrayList<String> values = (ArrayList) games.get("2");
            if (optionSelected == 2) {
                String a = values.get(0);
                String b = values.get(1);
                int c = Integer.valueOf(values.get(2));
                String dev = "";
                AbstractGame game = new SinglePlayerGame(a, b, userPlatformName, c, dev);
                game.printGameDetails();
            }
            Scanner wait = new Scanner(System.in);
            System.out.println("Press enter to continue");
        }




        // ArrayList<String> val1 = (ArrayList)games.get("1");

        // String gameName = val1.get(0);
        // String gameGenre = val1.get(1);
        // int gameYear = Integer.valueOf(val1.get(2));

        // Single-player games
        // SinglePlayerGame spGame1 = new SinglePlayerGame(gameName, gameGenre, "PC",
        // gameYear, "FromSoftware");
        // SinglePlayerGame spGame2 = new SinglePlayerGame(gameName, gameGenre, "PC",
        // gameYear, "Team Cherry");
        // SinglePlayerGame spGame3 = new SinglePlayerGame(gameName, gameGenre, "PC",
        // gameYear, "ConcernedApe");

        // Multiplayer games
        // MultiplayerGame mpGame1 = new MultiplayerGame(gameName, gameGenre, "PC",
        // gameYear, "Blizzard", 15, 5);
        // MultiplayerGame mpGame2 = new MultiplayerGame(gameName, gameGenre, "PC",
        // gameYear, "Riot Games", 20, 10);
        // MultiplayerGame mpGame3 = new MultiplayerGame(gameName, gameGenre, "PC",
        // gameYear, "Psyonix", 50, 30);

        // user.addGame(spGame1);
        // user.addGame(spGame2);
        // user.addGame(spGame3);
        // user.addGame(mpGame1);
        // user.addGame(mpGame2);
        // user.addGame(mpGame3);

        // Update progress for all games
        // spGame1.updateProgress();
        // spGame2.updateProgress();
        // spGame3.updateProgress();
        // mpGame1.updateProgress();
        // mpGame2.updateProgress();
        // mpGame3.updateProgress();

        // // Track progress
        // System.out.println("--- Game Progress ---");
        // spGame1.trackProgress();
        // spGame2.trackProgress();
        // spGame3.trackProgress();
        // mpGame1.trackProgress();
        // mpGame2.trackProgress();
        // mpGame3.trackProgress();
    }
}