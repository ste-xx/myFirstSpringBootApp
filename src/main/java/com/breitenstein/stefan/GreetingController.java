package com.breitenstein.stefan;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by sonste on 05.09.2016.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Inject
    private GreetingRepository greetingRepository;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

        Greeting greeting = new Greeting(counter.incrementAndGet(),
                String.format(template, name));
        greetingRepository.save(greeting);
        return greeting;
    }

    @RequestMapping("/greeting/{id}")
    public Greeting greeting(@PathVariable Long id) {
        return greetingRepository.findOne(id);
    }
}
