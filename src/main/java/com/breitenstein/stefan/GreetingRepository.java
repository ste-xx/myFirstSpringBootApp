package com.breitenstein.stefan;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by sonste on 05.09.2016.
 */
public interface GreetingRepository extends CrudRepository<Greeting, Long> {

    List<Greeting> findByContent(String content);

}
