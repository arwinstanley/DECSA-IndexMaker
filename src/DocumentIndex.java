import java.util.*;
public class DocumentIndex extends TreeMap<String, IndexEntry> {
public DocumentIndex(){
  super();
}
public void addWord(String entry, int index){
  entry = entry.toUpperCase();
  if (!this.containsKey(entry))
			this.put(entry, new IndexEntry(entry));
		this.get(entry).add(index);
}
public void addAllWords(String entry, int index) {
  entry = entry.toUpperCase();
  String[] entrys = entry.split("\\W+");
  for ( int i=0; i<entrys.length; i++) {
    if (!entrys[i].isEmpty())
      addWord(entrys[i], index);
  }
}
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
