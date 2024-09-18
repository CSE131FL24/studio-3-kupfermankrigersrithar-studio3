package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("what is your upper limit? ");
		int n = in.nextInt();
		
		
		boolean[] arr = new boolean[n];
		
		for(int i =0; i < n; i++) {
			arr[i] = true;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(arr[i]) {
				for(int j = 2 * i; j < n; j += i) {
					arr[j] = false;
				}
			}
		}
		for(int q = 2; q < n; q++) {
			if(arr[q]) {
				System.out.print(q + ", ");
			}
		}

	}

}
