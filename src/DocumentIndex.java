/**
*This class is used to add to and create a whole lot of Index entrys
*
*@author Alex Winstanely
*@date 11/17/17
*/
import java.util.*;
public class DocumentIndex extends TreeMap<String, IndexEntry> {
	/**
	 * 
	 * Creates a standard TreeMap from DocumentIndex super Constructor
	 * 
	 * @param none
	 */
public DocumentIndex(){
  super();
}
/**
 * 
 * Adds a word to the IndexEntry List
 * 
 * @param entry is the String that you are looking for on the given line
 * @param index is the line number
 */
public void addWord(String entry, int index){
   if(index<0)
	   return ;
  entry = entry.toUpperCase();
  if (!this.containsKey(entry))
			this.put(entry, new IndexEntry(entry));
		this.get(entry).add(index);
}
/**
 * 
 * Adds all the words to the IndexEntry List
 * 
 * @param entry is the String that you are looking for on the given line
 * @param index is the line number
 */
public void addAllWords(String entry, int index) {
	   if(index<0)
		   return ;
  entry = entry.toUpperCase();
  String[] entrys = entry.split("\\W+");
  for ( int i=0; i<entrys.length; i++) {
    if (!entrys[i].isEmpty())
      addWord(entrys[i], index);
  }
}
/**
* 
* returns an String that shows what the object is
* 
* @param none
* @return a String representation of the object
*/
@Override
public String toString() {
  String out = "";
  for (IndexEntry entry : this.values()){
    out += entry;
    out += "\n";
  }
  return out;
}
}
