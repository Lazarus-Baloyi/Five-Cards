package za.co.laz.poker.fivecard.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.co.laz.poker.fivecard.model.Card;
import za.co.laz.poker.fivecard.model.Deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Component
public class DeckRepository {
    private Logger LOG = LoggerFactory.getLogger(DeckRepository.class);
    private ArrayList<Card> cards;

    public Deck shuffleDeck(){

        Deck deck;
        cards = new ArrayList<Card>();
        int index_1, index_2;
        Random generator = new Random();
        Card temp;
        try {
            for (short a = 0; a <= 3; a++) {
                for (short b = 0; b <= 12; b++) {
                    cards.add(new Card(a, b));
                }
            }

            int size = cards.size() - 1;

            for (short i = 0; i < 100; i++) {
                index_1 = generator.nextInt(size);
                index_2 = generator.nextInt(size);

                temp = (Card) cards.get(index_2);
                cards.set(index_2, cards.get(index_1));
                cards.set(index_1, temp);
            }
        }catch (Exception e){
            LOG.info("Caught exception: "+e);
        }
        deck = new Deck(cards);
        //LOG.info("Deck: "+ Arrays.toString(new Deck[]{deck}));

        return deck;
    }



    public int getTotalCards()
    {
        return cards.size();
        //we could use this method when making
        //a complete poker game to see if we needed a new deck
    }




}
