package br.com.dars.integrationcrm;

import br.com.dars.integrationcrm.quartz.SchedulingTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegrationCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationCrmApplication.class, args);

		SchedulingTask scheduling = new SchedulingTask();
		scheduling.scheduleFutureTask();
	}

}
