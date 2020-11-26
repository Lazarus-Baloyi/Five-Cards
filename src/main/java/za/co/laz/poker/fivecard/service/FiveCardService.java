package za.co.laz.poker.fivecard.service;

import org.springframework.stereotype.Component;
import za.co.laz.poker.fivecard.model.Deck;

@Component
public interface FiveCardService {
    Deck shuffleDeck();
    int[] dealHand(Deck deck);
    String printEvaluation(int[] hand);
}
