import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int lines = input.nextInt();
		input.nextLine();
		String word = "";
		int result = 0;
		for(int i = 0; i < lines; i++){
			word = input.nextLine();
			if(word.charAt(1) == '+')
				result++;
			if(word.charAt(1) == '-')
				result--;
		}
		System.out.println(result);
	}
}