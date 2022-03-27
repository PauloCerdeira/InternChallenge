package com.challenge.intern_challenge;

import com.challenge.intern_challenge.model.Traders;
import com.challenge.intern_challenge.repository.TradersRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InternChallengeApplication {

	public static void main(String[] args) {
		// SpringApplication.run(InternChallengeApplication.class, args);
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(InternChallengeApplication.class, args);
		TradersRepository traderRepository = configurableApplicationContext.getBean(TradersRepository.class);
		for (int i = 0; i < 5; i++) {
			Traders trader = new Traders("PCE", "Paulo Cerdeira");
			traderRepository.save(trader);

		}
	}

}
