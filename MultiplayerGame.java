public class MultiplayerGame extends AbstractGame implements Playable {
    private int wins;
    private int losses;

    public double getWinLossRatio() {
        return (losses == 0) ? wins : (double) wins / losses;
    }

    public MultiplayerGame(String title, String genre, String platform, int releaseYear, String developer, int wins,
            int losses) {
        super(title, genre, platform, releaseYear, developer);
        this.wins = wins;
        this.losses = losses;
    }

    @Override
    public void updateProgress() {
        wins++;
    }

    @Override
    public void trackProgress() {
        System.out.println("Wins: " + wins + ", Losses: " + losses);
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
}
