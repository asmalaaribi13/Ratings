
/**
 * Décrivez votre classe GenreFilter ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class GenreFilter implements Filter {
    private String myGenre;
    
    public GenreFilter (String genre) {
        myGenre = genre;
    }
    
    @Override
    public boolean satisfies(String id) {
        return MovieDatabase.getGenres(id).contains(myGenre);
    }
}
