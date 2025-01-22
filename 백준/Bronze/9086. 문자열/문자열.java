import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0; i<t; i++) {
			String word = s.next();
			System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
		}
		s.close();
	}
}