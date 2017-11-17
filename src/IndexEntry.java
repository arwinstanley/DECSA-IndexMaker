/**
*This class is used to store an Index Entry which is a TreeSet of integers and a String for the word
*
*@author Alex Winstanely
*@date 11/17/17
*/
import java.util.*;
public class IndexEntry implements Comparable<IndexEntry>   {
	private TreeSet<Integer> lines;
	private String gloWord; //It was 'birdUp' but I was told this is unproffesional
        /**
	 * 
	 * One parameter constructor that takes in a String word, which is then indexed as many times as it exists
	 * 
	 * @param word is the word that your indexing
	 */
public IndexEntry(String word) {
	gloWord = word;
	lines = new TreeSet<Integer>();
}
	/**
	 * 
	 * Adds a number to the list of line numbers
	 * 
	 * @param num is the line number of another index of this word
	 */
public void add(int num) {
	if (!(lines.contains(num)))
				lines.add(num);
}
        /**
	 * 
	 * Returns the indexing 
	 * 
	 * @param none
	 */
public String getWord() {
	return gloWord;
}
        /**
	 * 
	 * returns an int that shows the differences between two IndexEntrys
	 * 
	 * @param other is a seconfd instance of IndexEntry to compare to another
	 */
	@Override
public int compareTo(IndexEntry other) {
	return this.gloWord.compareTo(other.getWord());
}
	        /**
	 * 
	 * returns an String that shows what the object is
	 * 
	 * @param none
	 */
public String toString() {
	String output = gloWord + " ";	
	for (Integer entry : lines) {
		if(entry == lines.last() )
			output += entry.toString();
		else 
			output += entry.toString() + ", ";	
	}
	return output;
}

}
