package br.ailtonbsj.ps_supera;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MonetaryDecomposerTest {

	private final PrintStream stdOut = System.out;
	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	
	private final String INPUT1 =
"""
576.73
""";
	private final String OUTPUT1 =
"""
NOTAS:
5 nota(s)  de R$ 100.00
1 nota(s)  de R$  50.00
1 nota(s)  de R$  20.00
0 nota(s)  de R$  10.00
1 nota(s)  de R$   5.00
0 nota(s)  de R$   2.00
MOEDAS:
1 moeda(s) de R$   1.00
1 moeda(s) de R$   0.50
0 moeda(s) de R$   0.25
2 moeda(s) de R$   0.10
0 moeda(s) de R$   0.05
3 moeda(s) de R$   0.01
""";
	
	private final String INPUT2 =
"""
2.76
""";
	private final String OUTPUT2 =
"""
NOTAS:
0 nota(s)  de R$ 100.00
0 nota(s)  de R$  50.00
0 nota(s)  de R$  20.00
0 nota(s)  de R$  10.00
0 nota(s)  de R$   5.00
1 nota(s)  de R$   2.00
MOEDAS:
0 moeda(s) de R$   1.00
1 moeda(s) de R$   0.50
1 moeda(s) de R$   0.25
0 moeda(s) de R$   0.10
0 moeda(s) de R$   0.05
1 moeda(s) de R$   0.01
""";

	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outStream));
	}
	
	@AfterEach
	public void tearDown() {
	    System.setOut(stdOut);
	}
	
	@Test
	public void decomposeWithValuesOnDocument() {
		ByteArrayInputStream in = new ByteArrayInputStream(INPUT1.getBytes());
		System.setIn(in);
		
		MonetaryDecomposer md = new MonetaryDecomposer();
		md.challenge();
		
		Assertions.assertEquals(OUTPUT1.trim(), outStream.toString().trim());
	}
	
	@Test
	public void decomposeWithMyValues() {
		ByteArrayInputStream in = new ByteArrayInputStream(INPUT2.getBytes());
		System.setIn(in);
		
		MonetaryDecomposer md = new MonetaryDecomposer();
		md.challenge();
		
		Assertions.assertEquals(OUTPUT2.trim(), outStream.toString().trim());
	}
	
}
