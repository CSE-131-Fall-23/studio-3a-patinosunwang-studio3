package studio3;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = in.nextInt();
		
		boolean [] arr = new boolean[n];
		for(int i = 2; i < n; i++ ) {
			arr[i] = true;
		}
		
		for(int i = 2; i * i <= n; i++) {
			if(arr[i] == true) {
				for(int j= i * i; j < n;j=j+i) {
					arr[j] = false;
				}
			}
			
			
		}
		
		for(int a = 2; a < n; a++) {
			if(arr[a] == true) {
				System.out.print(a + " ");
			}
		}
		
		
		

}
}
