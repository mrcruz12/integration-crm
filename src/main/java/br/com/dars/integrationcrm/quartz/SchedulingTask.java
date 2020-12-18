package br.com.dars.integrationcrm.quartz;

import br.com.dars.integrationcrm.IntegrationCrmApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@EnableScheduling
public class SchedulingTask {

    private final long MINUT = 1000 * 6;
    private long i = 0;
    private static final Logger log = LoggerFactory.getLogger(IntegrationCrmApplication.class);

    @Scheduled(fixedDelay = MINUT)
    public void scheduleFutureTask() {




        log.info("Schedule rodando:  ###########################################################  ");

    }

}