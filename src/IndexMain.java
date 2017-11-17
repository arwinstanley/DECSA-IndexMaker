/**
*This program allows a user to create an index of data entrys and export them as a text document
*
*
* @author WinstanleyA
* @Date 11/17/17
*/
import java.io.*;
import java.util.Scanner;
public class IndexMain {
	/**
	 * @author WinstanleyA
	 * @Date 11/17/17
	 * @param fNme the name of the file your writing to
	 * @return input a PrintWriter which will be able to write to the file given in fNme
	 */
	public static PrintWriter readerW(String fNme) {
		File scannable = new File( fNme );
		PrintWriter input = null;
		try {
			input = new PrintWriter(scannable);
		} catch (FileNotFoundException ex) {
			System.out.println("Cant open file: " + fNme);
			return null;
		}
		return input;
	}
	/**
	 * @author WinstanleyA
	 * @Date 11/17/17
	 * @param fNme the name of the file you wish to read
	 * @return input a Scanner to read the file you gave as input
	 */
		public static Scanner reader(String fNme) {
		File scannable = new File( fNme );
		Scanner input = null;
		try {
			input = new Scanner(scannable);
		} catch (FileNotFoundException ex) {
			return null;
		}
		return input;
	}

		/**
		 * @author WinstanleyA
		 * @Date 11/17/17
		 * @param args is the names of all the files you want to use in this program
		 */
		public static void main(String[] args) {
			String file1 = "";
			String file2 = "";
			if(args.length==1||args.length==0) {
				Scanner keyboard = new Scanner(System.in);
				System.out.println("in valid number of files please enter " );
				System.out.println("an input file name then an output" );
				System.out.println("" );
				System.out.println("input: " );
				file1 = keyboard.nextLine();
				System.out.println("output: " );
				file2 = keyboard.nextLine();
				keyboard.close();
				if(file1.equals("")&&file2.equals("")) {
					file1 = "fish.txt";
					file2 = "output.txt";
					System.out.println("an input and output have been made for you" );
				}
					
			}
			else {
			    file1 = args[0];
				file2 = args[1];
			}
			if(file1.equals("")) {
				System.out.println("invalid input");
			}
			if(file1.indexOf(".")==-1) {
				file1 = file1+".txt";
				System.out.println("input appended with '.txt' ");
			}
			if(file2.equals("")) {
				System.out.println("invalid output");
				System.out.println("creating output");
	             file2 = file1.substring(0, file1.indexOf("."))+ "(output)" + file1.substring(file1.indexOf("."), file1.length());
				}
			
			Scanner input = reader(file1);
			PrintWriter output = readerW(file2);
			
			output.println("==================DocumentIndex==================");
			output.println();
			output.println("Standard New Document");
			output.println();
			DocumentIndex testDoc1 = new DocumentIndex();
			output.println(testDoc1);
			output.println("expected result blank line ^");
			output.println();
			output.println("Adding in 1 word ");
			output.println();
			testDoc1.addWord(input.nextLine(), 1);
			int index = 2;
			output.println("Adding in all other words ");
			while (input.hasNextLine()) {
				testDoc1.addAllWords(input.nextLine(), index);
				index++;
			}
			output.println("=========================== Index of " + file1 + " ===========================");
			output.println();
			output.print(testDoc1);
			System.out.println(testDoc1); //works in terminal but not in output file??
			output.println();
			output.println();
			output.println();
			output.println("========================================================================");
			output.println();
			output.println("==================IndexEntry==================");
			output.println();
			output.println("Standard New Entry");
			IndexEntry testEntry1 = new IndexEntry("fish");
			output.println(testEntry1);
			output.println("expected result 'fish' ^");
			testEntry1.add(9);
			testEntry1.add(9);
			testEntry1.add(-9);
			testEntry1.add(10);
			testEntry1.add(11);
			testEntry1.add(45);
			testEntry1.add(19302);
			output.println(testEntry1);
			input.close();
			output.close();
			}
	
}


