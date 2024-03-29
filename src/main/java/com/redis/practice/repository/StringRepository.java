package com.redis.practice.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StringRepository {
    private final RedisTemplate<String, String> template;

    public void save(String key, String name) {
        template.opsForValue().set(key, name);
    }

    public String findByKey(String key) {
        return template.opsForValue().get(key);
    }
}
