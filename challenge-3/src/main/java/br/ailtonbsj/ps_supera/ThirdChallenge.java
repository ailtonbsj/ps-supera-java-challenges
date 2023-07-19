package br.ailtonbsj.ps_supera;

import java.util.Scanner;

public class ThirdChallenge {
	
	public void challenge() {
		// input
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		input.close();
		
		// process
		int amount = diffsEqualToTarget(arr, k);
		
		// output
		System.out.println(amount);
	}

	private int diffsEqualToTarget(int[] arr, int k) {
		int amount = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if((arr[i] - arr[j] == k) || (arr[j] - arr[i] == k)) amount++;
			}
		}
		return amount;
	}
	
}
