
public class Main {

	public static void main(String[] args) {

		Filmregister register = new Filmregister();
	
		Movie darknessMovie = new Movie("The Darkness", "The Darkness", "Greg McLean", 
										"Shayne Armstrong",
										"scaaaaary", "7/10", Genre.Horror, 2016, 
										"Jennifer Morrison", "Kevin Bacon", "Lucy Fry",
										"Radha Mitchell"); 

		Movie slumdog = new Movie("Slumdog Millionaire", "Slumdog Millionär", "Danny Boyle", 
										"Simon Beaufoy","sehr guter Film", "8/10", 
										Genre.Romance, 2009, "Dev Patel", "Freida Pinto", "Saurabh Shukla",
										"Anil Kapoor");
		
		register.addMovie(slumdog);
		register.addMovie(darknessMovie);
		
		System.out.println(slumdog.getInfo());

	}

}