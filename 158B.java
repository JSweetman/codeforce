import java.util.*;
import java.io.*;


public class Main{
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int[] storage = new int[3];
		int groups = input.nextInt();
		int num = 0;
		int result = 0;
		input.nextLine();
		for(int i = 0; i<groups; i++){
			num = input.nextInt();
			if(num == 4)
				result++;
			else
				storage[num-1]++;
		}
		// System.out.println("result after 4s: " + result);
		// pairs 1s and 3s and adds to result
		result += Math.min(storage[0], storage[2]);
		// System.out.println("result after 3s and 1s: " + result);
		// adds rest of 3s
		result += storage[2] - Math.min(storage[0], storage[2]);
		storage[0] -= Math.min(storage[0], storage[2]);
		// System.out.println("result after rest of 3s: " + result);
		// pair 2s
		result+= storage[1]/2;
		// System.out.println("result after 2s paired: " + result);
		storage[1] = storage[1]%2;
		if(storage[1] == 1){
			result++;
			storage[0]-=2;
		}
		if(storage[0] > 0){
			if(storage[0]%4 > 0)
				result++;
			result+= storage[0]/4;

		}
		// System.out.println("result after 1s: " + result);
		System.out.println(result);


	}
}