interface I_Filmregister {
	
	public void deleteMovie(Movie movie);
	
	
	
	public void addMovie(Movie movie);
		
	
	
	public String searchMovie (String movietitle);
	
	
	
	public void editMovieTitle (String oldTitle, String newTitle);

	
	
	public boolean containsMovie (Movie movie);
	
	
}

