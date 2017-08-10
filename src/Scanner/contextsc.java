package Scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class contextsc {

	public static void main(String[] args) throws FileNotFoundException {
		
		InputStream in = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\WordCount.java"));
		Scanner s = new Scanner(in);
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
		s.close();
	}

}
