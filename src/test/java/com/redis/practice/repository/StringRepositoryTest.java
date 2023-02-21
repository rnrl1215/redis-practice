package com.redis.practice.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringRepositoryTest {

    @Autowired
    StringRepository stringRepository;

    @Test
    void StringSaveTest() {
        String key = "key1";
        String value = "value1";
        stringRepository.save(key, value);

        String foundValue = stringRepository.findByKey(key);
        Assertions.assertThat(foundValue).isEqualTo(value);
    }
}