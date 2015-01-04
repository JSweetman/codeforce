import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		StringBuilder result = new StringBuilder();
		Scanner input = new Scanner(System.in);
		String line = input.nextLine().toLowerCase();
		for(int i = 0; i<line.length(); i++){
			if(line.charAt(i) != 'a' && line.charAt(i) != 'e' && line.charAt(i) != 'i' && line.charAt(i) != 'o' && line.charAt(i) != 'u' && line.charAt(i) != 'y' ){
				result.append('.');
				result.append(line.charAt(i));
			}
		}
		System.out.println(result);
	}
}