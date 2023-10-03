import java.util.ArrayList;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */
	public static int countUnique(ArrayList<String> list) {
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			String currentWord = list.get(i);
			boolean isUnique = true;

			// ----------------------------------------------------
			// Compare the current word with words that follow
			for (int j = i + 1; j < list.size(); j++) {
				if (currentWord.equals(list.get(j))) {
					isUnique = false;
					break;
				}
			}

			// ----------------------------------------------------
			// If the word is unique, increment the count
			if (isUnique) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
