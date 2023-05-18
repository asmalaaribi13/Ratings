
/**
 * Décrivez votre interface Rater ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
import java.util.*;

public interface Rater {
    public void addRating(String item, double rating);

    public boolean hasRating(String item);

    public String getID();

    public double getRating(String item);

    public int numRatings();

    public ArrayList<String> getItemsRated();
}

