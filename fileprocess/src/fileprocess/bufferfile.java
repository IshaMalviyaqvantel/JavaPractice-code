package fileprocess;
import java.io.*;

public class bufferfile {
	public static void main(String[] args) {
		File f=new File("myf.txt");

		
		try(FileReader fr =new FileReader(f); bufferedReader brea1=new bufferedReader(fr);) {
		
		String st =brea1.readLine();
		while(st!=null) {
			System.out.println(st);
			st=brea1.readLine();
			}
		}
		
		catch(FileNotFoundException e){
			System.out.println("file not found");
		}
			
	catch(IOException e)	{
		System.out.println("probleming in reading"+f.getName());
		
		}
		finally {
			try {
			BufferedReader brea1 = null;
			brea.close();
			 }
			catch(IOException e) {
				
			}
			catch(NullPointerException ex) {
				
			}
			
			 
		}
	}
}
