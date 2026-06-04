import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main{
	public static void main(String [] args){
		String filePath = "C:\\Users\\mbeke\\Documents\\New folder\\day-44-WRITEFILES\\file\\test.txt";
		
		String textContent = """
		I like pizza
		It is really good
		Buy me pizza
		Please?!
			""";
			
		try(FileWriter writer = new FileWriter(filePath)){
			
			writer.write(textContent);
			
		} catch(FileNotFoundException e){
			System.out.print("GIVE UP");
		}
		catch(IOException e){
			System.out.print(e.getMessage());
		}
		
	}
}