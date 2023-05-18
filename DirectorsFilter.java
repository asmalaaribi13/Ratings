
/**
 * Décrivez votre classe DirectorsFilter ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
import java.util.*;

public class DirectorsFilter implements Filter {
    String directorsList;
    
    public DirectorsFilter (String directors) {
        directorsList = directors;
    }
    
    
    public boolean satisfies(String id) {
        String[] directorsSplit = directorsList.split(",");
        for (int i=0; i < directorsSplit.length; i++) {
            if (MovieDatabase.getDirector(id).indexOf(directorsSplit[i]) != -1) {
                return true;
            }
        }
        return false;
    }
}
