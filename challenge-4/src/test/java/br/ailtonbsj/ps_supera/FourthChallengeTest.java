package br.ailtonbsj.ps_supera;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FourthChallengeTest {

	private final PrintStream stdOut = System.out;
	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

	private final String INPUT1 = """
			5
			I ENIL SIHTHSIREBBIG S
			LEVELKAYAK
			H YPPAHSYADILO
			ABCDEFGHIJKLMNOPQRSTUVWXYZ
			VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE
			""";
	private final String OUTPUT1 = """
			THIS LINE IS GIBBERISH
			LEVELKAYAK
			HAPPY HOLIDAYS
			MLKJIHGFEDCBAZYXWVUTSRQPON
			FRENCH HENS TWO DOVES AND A PARTRIDGE
			""";

	private final String INPUT2 = """
			1
			 OLLEH!DLROW
			""";
	private final String OUTPUT2 = """
			HELLO WORLD!
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

		FourthChallenge fc = new FourthChallenge();
		fc.challenge();

		Assertions.assertEquals(OUTPUT1.trim(), outStream.toString().trim());
	}

	@Test
	public void testWithMyValues() {
		ByteArrayInputStream in = new ByteArrayInputStream(INPUT2.getBytes());
		System.setIn(in);

		FourthChallenge fc = new FourthChallenge();
		fc.challenge();

		Assertions.assertEquals(OUTPUT2.trim(), outStream.toString().trim());
	}
}
