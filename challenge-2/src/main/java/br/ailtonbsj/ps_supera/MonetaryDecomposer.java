package br.ailtonbsj.ps_supera;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class MonetaryDecomposer {
	
	public void challenge() {
		// input
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double value = input.nextDouble();
		input.close();
		
		// process
		double[] bills = {100, 50, 20, 10, 5, 2};
		double[] coins = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
		Map<Double, Integer> amount = decompose(value, bills, coins);
		
		// output
		System.out.println("NOTAS:");
		Arrays.stream(bills).forEach(bill -> {
			System.out.printf("%d nota(s)  de R$ %6.2f\n", amount.get(bill), bill);
		});
		System.out.println("MOEDAS:");
		Arrays.stream(coins).forEach(coin -> {
			System.out.printf("%d moeda(s) de R$ %6.2f\n", amount.get(coin), coin);
		});
	}
	
	public Map<Double, Integer> decompose(double val, double[] bills, double[] coins) {
		double[] money = mergeArrays(bills, coins);
		Map<Double, Integer> amount = new HashMap<>();
		Arrays.stream(money).forEach(v -> amount.put(v, 0));
		while(val > 0) {
			for(int i = 0; i < money.length; i++) {
				if(val >= money[i]) {
					amount.put(money[i], amount.get(money[i]) + 1);
					val = roundDouble(val - money[i], 2);
					break;
				}
			}
		}
		return amount;
	}
	
	private double[] mergeArrays(double[] a, double[] b) {
		double[] c = new double[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		return c;
	}
	
	private double roundDouble(double d, int places) { 
        BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
	
}
