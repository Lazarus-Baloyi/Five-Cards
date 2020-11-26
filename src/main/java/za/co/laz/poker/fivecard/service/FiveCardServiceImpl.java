package za.co.laz.poker.fivecard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.laz.poker.fivecard.infrastructure.DeckRepository;
import za.co.laz.poker.fivecard.infrastructure.HandRepository;
import za.co.laz.poker.fivecard.model.Deck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class FiveCardServiceImpl implements FiveCardService {

    private Logger LOG = LoggerFactory.getLogger(FiveCardServiceImpl.class);

    @Autowired
    private DeckRepository deckRepository;

    @Autowired
    private HandRepository handRepository;

    @Override
    public Deck shuffleDeck() {
        LOG.info(" -------------Shuffling Deck-------------- ");
        return deckRepository.shuffleDeck();
    }

    @Override
    public int[] dealHand(Deck deck) {
        LOG.info(" -------------Dealing hand-------------- ");
        return handRepository.drawAndEvaluateHand(deck);
    }

    @Override
    public String printEvaluation(int[] hand) {
        LOG.info(" -------------Evaluating hand-------------- ");
        return  handRepository.translateHandValue(hand);

    }


}
