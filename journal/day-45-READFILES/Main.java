import java.io.*;

public class Main{
	public static void main(String [] args){
		String filePath = "C:\\Users\\mbeke\\Documents\\New folder\\day-44-WRITEFILES\\file\\test.txt";
		
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath));){
			String line;
			
			while((line = reader.readLine()) !=null){
				System.out.println(line);
			}
			
		} catch(FileNotFoundException e){
			System.out.print("GIVE UP");
		}
		catch(IOException e){
			System.out.print("Something went wrong");
		}
		
	}
}