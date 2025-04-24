public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        UserProfile user = new UserProfile("Gamer123", "PC");

        // Single-player games
        SinglePlayerGame spGame1 = new SinglePlayerGame("Elden Ring", "RPG", "PC", 2022, "FromSoftware");
        SinglePlayerGame spGame2 = new SinglePlayerGame("Hollow Knight", "Metroidvania", "PC", 2017, "Team Cherry");
        SinglePlayerGame spGame3 = new SinglePlayerGame("Stardew Valley", "Simulation", "PC", 2016, "ConcernedApe");

        // Multiplayer games
        MultiplayerGame mpGame1 = new MultiplayerGame("Overwatch 2", "FPS", "PC", 2022, "Blizzard", 15, 5);
        MultiplayerGame mpGame2 = new MultiplayerGame("Valorant", "FPS", "PC", 2020, "Riot Games", 20, 10);
        MultiplayerGame mpGame3 = new MultiplayerGame("Rocket League", "Sports", "PC", 2015, "Psyonix", 50, 30);

        user.addGame(spGame1);
        user.addGame(spGame2);
        user.addGame(spGame3);
        user.addGame(mpGame1);
        user.addGame(mpGame2);
        user.addGame(mpGame3);

        // Update progress for all games
        spGame1.updateProgress();
        spGame2.updateProgress();
        spGame3.updateProgress();
        mpGame1.updateProgress();
        mpGame2.updateProgress();
        mpGame3.updateProgress();

        // Track progress
        System.out.println("--- Game Progress ---");
        spGame1.trackProgress();
        spGame2.trackProgress();
        spGame3.trackProgress();
        mpGame1.trackProgress();
        mpGame2.trackProgress();
        mpGame3.trackProgress();
    }
}