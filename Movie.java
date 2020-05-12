public class Movie {

	// Attributes..
	private int movieId;
	private String title;
	private int releaseYear;
	private Movie left;
	private Movie right;
	
	// Constructor.
	public Movie(int movieId, String title, int releaseYear) {
		
		this.movieId = movieId;
		this.title = title;
		this.releaseYear = releaseYear;
		this.left = null;
		this.right = null;
	
	}

	public Movie getLeft() {
	
		return left;
	
	}

	public void setLeft(Movie left) {

		this.left = left;
	
	}

	public Movie getRight() {

		return right;
	
	}

	public void setRight(Movie right) {

		this.right = right;
	
	}

	public int getMovieId() {
	
		return movieId;
	
	}

	public void setMovieId(int movieId) {
	
		this.movieId = movieId;
	
	}

	public String getTitle() {
	
		return title;
	
	}

	public void setTitle(String title) {
	
		this.title = title;
	
	}

	public int getReleaseYear() {
	
		return releaseYear;
	
	}

	public void setReleaseYear(int releaseYear) {
	
		this.releaseYear = releaseYear;
	
	}
	
}
