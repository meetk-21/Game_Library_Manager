public abstract class AbstractGame {
    private String title;
    private String genre;
    private String platform;
    private int releaseYear;
    private String developer;

    public AbstractGame(String title, String genre, String platform, int releaseYear, String developer) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.releaseYear = releaseYear;
        this.developer = developer;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatform() {
        return platform;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    public void setDeveloper(String developer) {
        this.developer = developer;
    }
    
    public abstract void updateProgress();

}
