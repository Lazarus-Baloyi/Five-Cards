package za.co.laz.poker.fivecard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.laz.poker.fivecard.model.Deck;
import za.co.laz.poker.fivecard.service.FiveCardService;

@Component
public class FiveCardController {

    private Logger LOG = LoggerFactory.getLogger(FiveCardController.class);

    @Autowired
    private FiveCardService fiveCardService;

    public void runWithoutInput(){
        Deck deck = fiveCardService.shuffleDeck();
        String evaluation = fiveCardService.printEvaluation(fiveCardService.dealHand(deck));
        LOG.info(evaluation);
    }
}
