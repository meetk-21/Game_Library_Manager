import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserProfile {
    private String username;
    private String preferredPlatform;
    private List<AbstractGame> gamesOwned;
    private Map<AbstractGame, List<Integer>> gameRatings; // Stores ratings (1-5)
    private Map<AbstractGame, List<String>> gameReviews; // Stores textual reviews

    public UserProfile(String username, String preferredPlatform) {
        this.username = username;
        this.preferredPlatform = preferredPlatform;
        this.gamesOwned = new ArrayList<>();
        this.gameRatings = new HashMap<>();
        this.gameReviews = new HashMap<>();
    }

    // Add games
    public void addGame(AbstractGame game) {
        if (gamesOwned.contains(game)) {
            throw new IllegalArgumentException("Game already in library: " + game.getTitle());
        }
        gamesOwned.add(game);
        gameRatings.put(game, new ArrayList<>());
        gameReviews.put(game, new ArrayList<>());
    }

    // Remove games
    public void removeGame(AbstractGame game) {
        if (gamesOwned.contains(game)) {
            gamesOwned.remove(game);
            gameRatings.remove(game); // Removes all ratings for this game
            gameReviews.remove(game); // Removes all reviews for this game
        } else {
            System.out.println("Game not found in library.");
        }
    }

    public void addRating(AbstractGame game, int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be 1-5");
        }
        if (gamesOwned.contains(game)) {
            gameRatings.get(game).add(rating);
        } else {
            System.out.println("Game not found in library.");
        }
    }

    public void addReview(AbstractGame game, String review) {
        if (gamesOwned.contains(game)) {
            gameReviews.get(game).add(review);
        } else {
            System.out.println("Game not found in library.");
        }
    }

    // Search/filter methods
    public List<AbstractGame> searchByTitle(String title) {
        return gamesOwned.stream()
                .filter(game -> game.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    public List<AbstractGame> filterByGenre(String genre) {
        return gamesOwned.stream()
                .filter(game -> game.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public List<AbstractGame> filterByPlatform(String platform) {
        return gamesOwned.stream()
                .filter(game -> game.getPlatform().equalsIgnoreCase(platform))
                .collect(Collectors.toList());
    }

    // Calculates average rating for a game
    public double getAverageRating(AbstractGame game) {
        return gameRatings.getOrDefault(game, List.of()).stream()
                .mapToInt(Integer::intValue) // converts rating to integers
                .average()
                .orElse(0.0);
    }

    public List<AbstractGame> getGamesOwned() {
        return Collections.unmodifiableList(gamesOwned);
    }

    public List<String> getReviews(AbstractGame game) {
        return Collections.unmodifiableList(gameReviews.getOrDefault(game, List.of()));
    }

    // Existing getters/setters for username/preferredPlatform
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPreferredPlatform() {
        return preferredPlatform;
    }

    public void setPreferredPlatform(String preferredPlatform) {
        this.preferredPlatform = preferredPlatform;
    }
}