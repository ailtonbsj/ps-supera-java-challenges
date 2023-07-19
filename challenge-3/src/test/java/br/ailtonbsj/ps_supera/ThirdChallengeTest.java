package br.ailtonbsj.ps_supera;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
	
public class ThirdChallengeTest {

	private final PrintStream stdOut = System.out;
	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

	private final String INPUT1 = """
			5 2
			1 5 3 4 2
			""";
	private final String OUTPUT1 = """
			3
			""";

	private final String INPUT2 = """
			10 1
			1 2 3 4 5 6 7 8 9 10
			""";
	private final String OUTPUT2 = """
			9
			""";
	private final String INPUT3 = """
			4 1
			1 2 3 4
			""";
	private final String OUTPUT3 = """
			3
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
	public void testWithValuesOnDocument() {
		ByteArrayInputStream in = new ByteArrayInputStream(INPUT1.getBytes());
		System.setIn(in);

		ThirdChallenge tc = new ThirdChallenge();
		tc.challenge();

		Assertions.assertEquals(OUTPUT1.trim(), outStream.toString().trim());
	}
	
	@Test
	public void testWithValuesOnDocument2() {
		ByteArrayInputStream in = new ByteArrayInputStream(INPUT3.getBytes());
		System.setIn(in);

		ThirdChallenge tc = new ThirdChallenge();
		tc.challenge();

		Assertions.assertEquals(OUTPUT3.trim(), outStream.toString().trim());
	}

	@Test
	public void testWithMyValues() {
		ByteArrayInputStream in = new ByteArrayInputStream(INPUT2.getBytes());
		System.setIn(in);

		ThirdChallenge tc = new ThirdChallenge();
		tc.challenge();

		Assertions.assertEquals(OUTPUT2.trim(), outStream.toString().trim());
	}
}
