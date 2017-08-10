package Scanner;

import java.util.Scanner;

public class keyboardsc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()){
			String content = s.nextLine();
			System.out.println("echo: "+content);
		}
		s.close();
	}

}
