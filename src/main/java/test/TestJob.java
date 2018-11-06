package test;

import javax.inject.Inject;
import javax.inject.Singleton;
import io.micronaut.scheduling.annotation.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class TestJob {

    private static final Logger log = LoggerFactory.getLogger(TestJob.class);

    @Inject
    TestService testService;

    @Scheduled(fixedRate = "1s")
    public void process() {
        log.info(testService.test());
    }
}