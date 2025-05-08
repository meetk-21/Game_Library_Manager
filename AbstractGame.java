public abstract class AbstractGame {
    protected String title;
    protected String genre;
    protected String platform;
    protected int releaseYear;
    protected String developer;

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
    
    public void printGameDetails() {
        System.out.println("------------------------------");
        System.out.println(title);
        System.out.println(genre);
        System.out.println("------------------------------");

    }

    public abstract void updateProgress();
   
}
