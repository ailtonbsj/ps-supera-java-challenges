package br.ailtonbsj.ps_supera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IntegerSorter {
	
	public void challenge() {
		// input
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = input.nextInt();
		}
		input.close();
		
		// process
		List<Integer> sorted = sort(arr);
		
		// output
		sorted.stream().forEach(System.out::println);
	}
	
	public List<Integer> sort(int arr[]) {
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int aux = arr[i];
			if(aux % 2 == 0) even.add(aux);
			else odd.add(aux);
		}
		Collections.sort(even);
		Collections.sort(odd, Collections.reverseOrder());
		even.addAll(odd);
		return even;				
	}
	
}
