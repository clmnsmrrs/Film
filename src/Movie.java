import java.util.HashSet;
import java.util.Set;

public class Movie {

	private String movietitle, director, writer, info, germantitle, rating;
	private Genre genre;
	private int year;
	private Set<String> actors;

	public Movie() { 

		movietitle = null;
		germantitle = null;
		director = null;
		writer = null;
		info = null;
		rating = null;
		genre = genre.Unspecified;
		year = 0;
		actors = new HashSet<>();

	}

	
	public Movie(	String movietitle, String germantitle, String director, 
					String writer, String info, String rating,
					Genre genre, int year, String... feat){ 	

		this.movietitle = movietitle;							
		this.germantitle = germantitle;
		this.director = director;
		this.writer = writer;
		this.info = info;
		this.rating = rating;
		this.genre = genre;
		this.year = year;
		actors = new HashSet<String>();							 
		for (String actor : feat)
			actors.add(actor);
	
		
	}

	public String getMovietitle() {
		return movietitle;
	}

	public void setMovietitle(String movietitle) {
		this.movietitle = movietitle;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getGermantitle() {
		return germantitle;
	}

	public void setGermantitle(String germantitle) {
		this.germantitle = germantitle;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Set<String> getActors() {
		return actors;
	}

	public void setActors(Set<String> actors) {
		this.actors = actors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actors == null) ? 0 : actors.hashCode());
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((germantitle == null) ? 0 : germantitle.hashCode());
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result + ((movietitle == null) ? 0 : movietitle.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (actors == null) {
			if (other.actors != null)
				return false;
		} else if (!actors.equals(other.actors))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (genre != other.genre)
			return false;
		if (germantitle == null) {
			if (other.germantitle != null)
				return false;
		} else if (!germantitle.equals(other.germantitle))
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		if (movietitle == null) {
			if (other.movietitle != null)
				return false;
		} else if (!movietitle.equals(other.movietitle))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movie [movietitle=" + movietitle + ", director=" + director + ", writer=" + writer + ", info=" + info
				+ ", germantitle=" + germantitle + ", rating=" + rating + ", genre=" + genre + ", year=" + year
				+ ", actors=" + actors + "]";
	}

}
