import java.util.HashMap;
import java.util.Map;

public class Filmregister implements I_Filmregister {

	private Map<String, Movie> register;

	public Filmregister() {
		register = new HashMap<String, Movie>(); 

	}

	public Filmregister(Filmregister other) { 	
		register = other.register; 				
		
		if (register == null) 					
															
			register = new HashMap<String, Movie>();

	}

	@Override
	public void deleteMovie(Movie movie) {
		register.remove(movie.getMovietitle()); 

	}

	@Override
	public void addMovie(Movie movie) {
		register.put(movie.getMovietitle(), movie);
	}

	@Override
	public String searchMovie(String movietitle) {

		return null;
	}

	@Override
	public void editMovieTitle(String oldTitle, String newTitle) {
		register.get(oldTitle).setMovietitle(newTitle);
	}

	@Override
	public boolean containsMovie(Movie movie) {
		if (register.containsValue(movie))
			return true;
		else
			return false;
	}

}
