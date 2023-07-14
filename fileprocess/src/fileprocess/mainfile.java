package fileprocess;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class mainfile {

	public static void main(String[] args) {
		try {
		File f=new File("myf.txt");
		Scanner sc;
		
			sc = new Scanner(f);
		
		 while(sc.hasNextLine()) {
			 String st=sc.nextLine();
			 System.out.println(st);
		 }
		sc.close();
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		my m =new my();
		try {
			System.out.println(m.sub10n(8));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	}