import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int numWords = input.nextInt();
		input.nextLine();
		String word = "";
		StringBuilder result;
		for(int i = 0; i<numWords; i++){
			result = new StringBuilder();
			word = input.nextLine();
			if(word.length() > 10){
				result.append(word.charAt(0));
				result.append(word.length()-2);
				result.append(word.charAt(word.length()-1));
			}
			else
				result.append(word);
			System.out.println(result.toString());
		}
	}
}