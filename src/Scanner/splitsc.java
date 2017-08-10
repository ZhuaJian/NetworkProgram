package Scanner;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class splitsc {
	public static void main(String[] args) throws FileNotFoundException { 
        Scanner s = new Scanner("123 asdf sd 45 789 sdf asdfl,sdf.sdfl,asdf    ......asdfkl    las"); 
        s.useDelimiter(" |,|\\."); 
        while (s.hasNext()) { 
                System.out.println(s.next()); 
        } 
        s.close();
}
}
