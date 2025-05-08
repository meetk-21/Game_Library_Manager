public class SinglePlayerGame extends AbstractGame implements Playable {
    private int levelsCompleted;

    public SinglePlayerGame(String title, String genre, String platform, int releaseYear, String developer) {
        super(title, genre, platform, releaseYear, developer);
        this.levelsCompleted = 0;
    }

    @Override
    public void updateProgress() {
        levelsCompleted++;
    }

    @Override
    public void trackProgress() {
        System.out.println("Game Title: " + title);
        System.out.println("Levels completed: " + levelsCompleted);
    }
}