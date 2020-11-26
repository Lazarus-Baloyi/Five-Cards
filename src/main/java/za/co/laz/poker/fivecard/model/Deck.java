package za.co.laz.poker.fivecard.model;

import java.util.Random;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class Deck {

    private ArrayList<Card> cards;

    public Card drawFromDeck()
    {
        return cards.remove( cards.size()-1 );
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
