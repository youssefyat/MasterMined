package MasterMined.yat.zaza;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MasterMinedTest {

	MasterMined colors;

	@Before
	public void setUp() {

	}

	// 1 Couleurs
	@Test
	public void shouldReturnOn() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenBlack = new String[] { "BLACK", "", "", "", "" };
		assertThat(this.colors.compareCombinaison(givenBlack)).containsExactly(1, 0);
	}

	@Test
	public void shouldReturnZero() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenOrange = new String[] { "ORANGE", "", "", "", "" };
		assertThat(this.colors.compareCombinaison(givenOrange)).containsExactly(0, 0);
	}

	// 2 Couleurs
	@Test
	public void shouldReturnTwoZero() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenBlackRED = new String[] { "BLACK", "RED", "", "", "" };
		assertThat(this.colors.compareCombinaison(givenBlackRED)).containsExactly(2, 0);
	}

	@Test
	public void shouldReturnOneZeroWhenBBGivenBG() {
		this.colors = new MasterMined(new String[] { "BLACK", "BLACK", "-", "-", "-" });
		String[] givenBlackBlack = new String[] { "BLACK", "GREEN", "", "", "" };
		assertThat(this.colors.compareCombinaison(givenBlackBlack)).containsExactly(1, 0);
	}

	@Test
	public void shouldReturnOneZeroWhenBBGivenVG() {
		this.colors = new MasterMined(new String[] { "BLACK", "BLACK", "-", "-", "-" });
		String[] givenBlackBlack = new String[] { "GREEN", "BLACK", "", "", "" };
		assertThat(this.colors.compareCombinaison(givenBlackBlack)).containsExactly(1, 0);
	}

	@Test
	public void shouldReturnOneZero() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenBlackGreen = new String[] { "BLACK", "GREEN", "", "", "" };
		assertThat(this.colors.compareCombinaison(givenBlackGreen)).containsExactly(1, 0);
	}

	@Test
	public void shouldReturnZeroZero() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenOrangeSilver = new String[] { "ORANGE", "SILVER", "", "", "" };
		assertThat(this.colors.compareCombinaison(givenOrangeSilver)).containsExactly(0, 0);
	}

	@Test
	public void shouldReturnZeroOne() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenRedOrange = new String[] { "RED", "ORANGE", "", "", "" };
		assertThat(this.colors.compareCombinaison(givenRedOrange)).containsExactly(0, 1);
	}

	@Test
	public void shouldReturnZeroTwo() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenRedBlack = new String[] { "RED", "BLACK", "", "", "" };
		assertThat(this.colors.compareCombinaison(givenRedBlack)).containsExactly(0, 2);
	}

	// 3 Couleurs
	@Test
	public void shouldReturnTreeZero() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenBlackRedWhite = new String[] { "BLACK", "RED", "WHITE", "", "" };
		assertThat(this.colors.compareCombinaison(givenBlackRedWhite)).containsExactly(3, 0);
	}

	@Test
	public void shouldReturnZeroTree() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenRedWhiteBlack = new String[] { "RED", "WHITE", "BLACK", "", "" };
		assertThat(this.colors.compareCombinaison(givenRedWhiteBlack)).containsExactly(0, 3);
	}

	@Test
	public void shouldReturnZeroZeroForTree() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenOrangeSilverGreen = new String[] { "ORANGE", "SILVER", "GREEN", "", "" };
		assertThat(this.colors.compareCombinaison(givenOrangeSilverGreen)).containsExactly(0, 0);
	}

	@Test
	public void shouldReturnOneZeroForTree() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenBlackSilverGreen = new String[] { "BLACK", "SILVER", "GREEN", "", "" };
		assertThat(this.colors.compareCombinaison(givenBlackSilverGreen)).containsExactly(1, 0);
	}

	@Test
	public void shouldReturnTwoZeroForTree() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenBlackRedGreen = new String[] { "BLACK", "RED", "GREEN", "", "" };
		assertThat(this.colors.compareCombinaison(givenBlackRedGreen)).containsExactly(2, 0);
	}

	@Test
	public void shouldReturnZeroTwoForTree() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenOrangeBlackRed = new String[] { "ORANGE", "BLACK", "RED", "", "" };
		assertThat(this.colors.compareCombinaison(givenOrangeBlackRed)).containsExactly(0, 2);
	}

	@Test
	public void shouldReturnZeroOneForTree() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenOrangeGreenRed = new String[] { "ORANGE", "GREEN", "RED", "", "" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(0, 1);
	}

	// 5 Couleurs :D
	@Test
	public void shouldReturnFiveZeroForFive() {
		this.colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "ORANGE", "SILVER" });
		String[] givenOrangeGreenRed = new String[] { "BLACK", "RED", "WHITE", "ORANGE", "SILVER" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(5, 0);
	}

	@Test
	public void shouldReturnZeroFiveForFive() {
		this.colors = new MasterMined(new String[] { "WHITE", "SILVER", "ORANGE", "BLACK", "RED" });
		String[] givenOrangeGreenRed = new String[] { "RED", "BLACK", "SILVER", "WHITE", "ORANGE" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(0, 5);
	}

	@Test
	public void shouldReturnTreeOneForFive() {
		this.colors = new MasterMined(new String[] { "WHITE", "SILVER", "ORANGE", "BLACK", "RED" });
		String[] givenOrangeGreenRed = new String[] { "WHITE", "SILVER", "ORANGE", "WHITE", "BLACK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(3, 1);
	}

	@Test
	public void shouldReturnTreeTwoForFive() {
		this.colors = new MasterMined(new String[] { "WHITE", "SILVER", "ORANGE", "BLACK", "RED" });
		String[] givenOrangeGreenRed = new String[] { "WHITE", "SILVER", "ORANGE", "RED", "BLACK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(3, 2);
	}

	@Test
	public void shouldReturnTwoOneForFive() {
		this.colors = new MasterMined(new String[] { "WHITE", "SILVER", "ORANGE", "BLACK", "RED" });
		String[] givenOrangeGreenRed = new String[] { "WHITE", "SILVER", "GREEN", "WHITE", "BLACK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(2, 1);
	}

	@Test
	public void shouldReturnOneTwoForFive() {
		this.colors = new MasterMined(new String[] { "WHITE", "SILVER", "ORANGE", "BLACK", "GREEN" });
		String[] givenOrangeGreenRed = new String[] { "WHITE", "BLACK", "RED", "GREEN", "BLACK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(1, 2);
	}

	@Test
	public void shouldReturnOneTreeForFive() {
		this.colors = new MasterMined(new String[] { "WHITE", "SILVER", "BLACK", "RED", "WHITE" });
		String[] givenOrangeGreenRed = new String[] { "WHITE", "BLACK", "RED", "WHITE", "BLACK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(1, 3);
	}

	@Test
	public void shouldReturnTwoTreeForFive() {
		this.colors = new MasterMined(new String[] { "WHITE", "SILVER", "BLACK", "RED", "WHITE" });
		String[] givenOrangeGreenRed = new String[] { "WHITE", "SILVER", "RED", "WHITE", "BLACK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(2, 3);
	}

	@Test
	public void shouldReturnFourZeroForFive() {
		this.colors = new MasterMined(new String[] { "WHITE", "SILVER", "BLACK", "RED", "WHITE" });
		String[] givenOrangeGreenRed = new String[] { "WHITE", "SILVER", "BLACK", "RED", "BLACK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(4, 0);
	}

	@Test
	public void shouldReturnZeroFourForFive() {
		this.colors = new MasterMined(new String[] { "WHITE", "SILVER", "BLACK", "RED", "WHITE" });
		String[] givenOrangeGreenRed = new String[] { "SILVER", "WHITE", "RED", "BLACK", "BLACK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(0, 4);
	}

	@Test
	public void shouldReturnZeroTreeForFive() {
		this.colors = new MasterMined(new String[] { "WHITE", "SILVER", "BLACK", "RED", "PURPLE" });
		String[] givenOrangeGreenRed = new String[] { "SILVER", "WHITE", "RED", "GREEN", "PINK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(0, 3);
	}

	@Test
	public void shouldReturnTreeZeroForFive() {
		this.colors = new MasterMined(new String[] { "SILVER", "WHITE", "RED", "RED", "PURPLE" });
		String[] givenOrangeGreenRed = new String[] { "SILVER", "WHITE", "RED", "GREEN", "PINK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(3, 0);
	}

	@Test
	public void shouldReturnOneOneForFive() {
		this.colors = new MasterMined(new String[] { "SILVER", "SILVER", "RED", "RED", "PURPLE" });
		String[] givenOrangeGreenRed = new String[] { "SILVER", "WHITE", "SILVER", "SILVER", "PINK" };
		assertThat(this.colors.compareCombinaison(givenOrangeGreenRed)).containsExactly(1, 1);
	}
}
