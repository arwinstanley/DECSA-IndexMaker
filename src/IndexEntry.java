import java.util.*;
public class IndexEntry implements Comparable<IndexEntry>   {
	private TreeSet<Integer> lines;
	private String birdUp;
public IndexEntry(String word) {
	birdUp = word;
	lines = new TreeSet<Integer>();
}
public void add(int num) {
	
}
public String getWord() {
	return birdUp;
}
public int compareTo(IndexEntry other) {
	
}
}
