import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/** Models the truth question bank
 */

public class Truth {
	
	private String fileName;
	private QBank t;
	
	public Truth(String string) {
		this.fileName = string;
		t = new QBank();
		System.out.println(string);
		try {
			FileReader reader = new FileReader(string);
			BufferedReader br = new BufferedReader(reader);
			
			String cur;
			while ((cur = br.readLine()) != null) {
				System.out.println(cur);
			}
			
			br.close();
			reader.close();
			
		} catch (IOException e) {
			System.out.print("Could not find the file");
		} 
	}
	
	/**public void addQuestions() {
		try {
			FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);
			
			String cur;
			while ((cur = br.readLine()) != null) {
				System.out.println(cur);
			}
			
			br.close();
			reader.close();
			
		} catch (IOException e) {
			System.out.print("Could not find the file");
		} 
	}**/

}
