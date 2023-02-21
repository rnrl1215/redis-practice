package com.redis.practice.redis_basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisTest {
    @Test
    void redisTest() {
        JedisPool jedisPool = new JedisPool(new JedisPoolConfig(), "localhost", 6379);
        Jedis jedis = jedisPool.getResource();
        jedis.set("key1", "data1");
        String test1 = jedis.get("key1");
        Assertions.assertThat(test1).isEqualTo("data1");
    }
}
