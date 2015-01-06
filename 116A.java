import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int lines = input.nextInt();
		int total = 0;
		int max = 0;
		for(int i = 0; i < lines; i++){
			total -= input.nextInt();
			total += input.nextInt();
			if(max < total)
				max = total;
		}
		System.out.println(max);
	}
}