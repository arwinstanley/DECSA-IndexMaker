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
public IndexEntry(String word) {
	gloWord = word;
	lines = new TreeSet<Integer>();
}
public void add(int num) {
	if (!(lines.contains(num)))
				lines.add(num);
}
public String getWord() {
	return gloWord;
}
	@Override
public int compareTo(IndexEntry other) {
	return this.gloWord.compareTo(other.getWord());
}
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
