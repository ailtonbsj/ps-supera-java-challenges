package br.ailtonbsj.ps_supera;

import java.util.Scanner;

public class FourthChallenge {
	
	public void challenge() {
		// input
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		
		// process + output
		while (n > 0) {
			String l = input.nextLine();
			int center = (l.length() / 2) - 1;
			for (int i = center; i >= 0; i--) {
				System.out.print(l.charAt(i));
			}
			for (int i = l.length()-1; i > center; i--) {
				System.out.print(l.charAt(i));
			}
			System.out.println();
			n--;
		}
		input.close();
	}
	
}
