package br.ailtonbsj.ps_supera;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerSorterTest {
	
	private final PrintStream stdOut = System.out;
	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	
	private final String INPUT1 =
"""
10
4
32
34
543
3456
654
567
87
6789
98
""";
	private final String OUTPUT1 =
"""
4
32
34
98
654
3456
6789
567
543
87
""";
	private final String INPUT2 =
"""
7
1
2
3
4
5
6
7
""";
	private final String OUTPUT2 =
"""
2
4
6
7
5
3
1
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
	public void sortWithValuesOnDocument() {
		ByteArrayInputStream in = new ByteArrayInputStream(INPUT1.getBytes());
		System.setIn(in);
		
		IntegerSorter integerSorter = new IntegerSorter();
		integerSorter.challenge();
		
		Assertions.assertEquals(OUTPUT1.trim(), outStream.toString().trim());
	}
	
	@Test
	public void sortWithMyValues() {
		ByteArrayInputStream in = new ByteArrayInputStream(INPUT2.getBytes());
		System.setIn(in);
		
		IntegerSorter integerSorter = new IntegerSorter();
		integerSorter.challenge();
		
		Assertions.assertEquals(OUTPUT2.trim(), outStream.toString().trim());
	}
	
}
