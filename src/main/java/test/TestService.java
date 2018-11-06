package test;

import io.micronaut.context.annotation.Value;

import javax.inject.Singleton;

@Singleton
public class TestService {

    @Value("${app.param}")
    String param = "";

    public String test() {
        return "test " + param;
    }

}