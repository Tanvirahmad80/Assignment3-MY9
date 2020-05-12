import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MyApp {

	// Main method.
	public static void main(String[] args) {

		// BST.
		MovieBST bst = new MovieBST();
		String filename = "data/movies.csv";
		// Reading the file.
		String[] tokens = null;
		try {

			Scanner scan = new Scanner(new File(filename));
			scan.nextLine();
			// reading.
			while (scan.hasNextLine()) {

				try {
					tokens = split(scan.nextLine());
					int id = Integer.parseInt(tokens[0]);
					String name = tokens[1];
					name = name.replaceAll("\"", "").trim();
					int year = Integer.parseInt(name.substring(name.lastIndexOf('(') + 1, name.length() - 1));
					name = name.substring(0, name.lastIndexOf(' '));
					Movie movie = new Movie(id, name, year);
					bst.add(movie);

				} catch (Exception e) {
				}

			}
			scan.close();

		} catch (Exception e) {
			System.out.println(Arrays.toString(tokens));
			e.printStackTrace();
		}
		// Reading complete..
		Set<String> values = bst.subSet("Back to the Future", "Hulk");
		Iterator<String> iterator = values.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static String[] split(String data) {
		
		ArrayList<String> tokens = new ArrayList<String>();
		boolean isComma = true;
		int start = 0;
		for (int i = 0; i < data.length() - 1; i++) {
			if (data.charAt(i) == ',' && isComma) {
				tokens.add(data.substring(start, i));
				start = i + 1;
			} else if (data.charAt(i) == '"')
				isComma = !isComma;
		}
		tokens.add(data.substring(start));
		return tokens.toArray(new String[] {});
	
	}

}
