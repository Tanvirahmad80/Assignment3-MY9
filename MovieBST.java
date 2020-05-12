import java.util.Set;
import java.util.TreeSet;

public class MovieBST {

	// Attributes..
	private Movie root;
	
	// Constructor.
	public MovieBST() {
		
		this.root = null;
		
	}
	
	// adding.
	public void add(Movie movie) {
		
		root = addRecursive(root, movie);
		
	}
	
	private Movie addRecursive(Movie current, Movie movie) {
		
		if(current == null) {
			current = movie;
			return current;
		}
		
		if(movie.getTitle().compareTo(current.getTitle()) < 0) {
			
			current.setLeft(addRecursive(current.getLeft(), movie));
			
		} else if (movie.getTitle().compareTo(current.getTitle()) > 0) {
			
			current.setRight(addRecursive(current.getRight(), movie));
			
		}
		return current;
		
	}
	
	public Set<String> subSet(String first, String end) {
		
		Set<String> set = new TreeSet<>();
		
		subSetRecursive(root, first, end, set);
		
		return set;
		
	}
	
	private void subSetRecursive(Movie current, String first, String end, Set<String> movies) {
		
		if(current == null) {
			return;
		}
		subSetRecursive(current.getLeft(), first, end, movies);
		if(current.getTitle().compareTo(first) > 0 && current.getTitle().compareTo(end) < 0) {
			movies.add(current.getTitle());
		}
		subSetRecursive(current.getRight(), first, end, movies);
		
	}
	
}
