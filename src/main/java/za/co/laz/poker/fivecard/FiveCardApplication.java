package za.co.laz.poker.fivecard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import za.co.laz.poker.fivecard.controller.FiveCardController;

@SpringBootApplication
public class FiveCardApplication {


	public static void main(String[] args) {
		ApplicationContext applicationContext  = SpringApplication.run(FiveCardApplication.class, args);
		FiveCardController fiveCardController = applicationContext.getBean(FiveCardController.class);

		fiveCardController.runWithoutInput();
	}

}
