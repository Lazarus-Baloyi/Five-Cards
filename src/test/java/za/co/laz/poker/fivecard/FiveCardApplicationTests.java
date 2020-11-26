package za.co.laz.poker.fivecard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.co.laz.poker.fivecard.model.Card;
import za.co.laz.poker.fivecard.model.Deck;
import za.co.laz.poker.fivecard.service.FiveCardService;

import java.util.ArrayList;


@SpringBootTest
@RunWith(SpringRunner.class)
class FiveCardApplicationTests {

	private Logger LOG = LoggerFactory.getLogger(FiveCardApplicationTests.class);

	@Test
	void contextLoads() {
	}

	@Autowired
	private FiveCardService fiveCardService;

	@Test
	public void testPrintEvaluation(){
		int[] dealtHand = new int[2];
		dealtHand[0] = 4;
		Assertions.assertEquals("three of a kind Ace's",fiveCardService.printEvaluation(dealtHand));
	}

	@Test
	public void testDealHand(){
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new Card((short)2,(short)10));
		cards.add(new Card((short)3,(short)3));
		cards.add(new Card((short)1,(short)3));
		cards.add(new Card((short)0,(short)2));
		cards.add(new Card((short)3,(short)12));
		int[] value = {2, 3, 12, 10, 2, 0};
		Assertions.assertArrayEquals(value,fiveCardService.dealHand(new Deck(cards)));
	}
}
