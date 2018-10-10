package pkgCore;
import pkgCore.Deck;
import static org.junit.jupiter.api.Assertions.*;
import pkgEnum.eSuit;
import org.junit.jupiter.api.Test;
class DeckTest {

	@Test
	void test() {
	Deck d = new Deck();
	assertTrue(d.getRemaining(eSuit.HEARTS) == 13);
	}
}
