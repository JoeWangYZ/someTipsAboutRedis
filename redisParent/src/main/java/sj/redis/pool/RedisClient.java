package sj.redis.pool;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Protocol;

import java.util.*;

/**
 * Created by Joe Wang on 2016/11/29.
 */

public class RedisClient implements RedisOperation{


    public RedisClient(RedisConfig config) {

    }

    public byte[] get(String key) {
        return new byte[0];
    }

    public String hget(String key, String field) {
        return null;
    }

    public Boolean set(String key, byte[] data) {
        return null;
    }

    public Boolean hmset(String key, Map<String, String> map) {
        return null;
    }

    public Boolean hmultiset(String key, Map<String, byte[]> map) {
        return null;
    }

    public Long hset(String key, String field, String value) {
        return null;
    }

    public Long hset(String key, String field, byte[] value) {
        return null;
    }

    public List<String> hmget(String key, String... fields) {
        return null;
    }

    public List<byte[]> hmultiget(String key, String... fields) {
        return null;
    }

    public Map<String, String> hmgetall(String key) {
        return null;
    }

    public Map<String, byte[]> hgetall(String key) {
        return null;
    }

    public Boolean hdel(String key, String... field) {
        return null;
    }

    public Set<String> hkeys(String key) {
        return null;
    }

    public Boolean set(String key, byte[] data, int exp) {
        return null;
    }

    public Boolean del(String key) {
        return null;
    }

    public Long sadd(String key, String... members) {
        return null;
    }

    public Set<String> smembers(String key) {
        return null;
    }

    public Boolean sismember(String key, String member) {
        return null;
    }

    public Boolean mset(Map<String, byte[]> keyDatas) {
        return null;
    }

    public Map<String, byte[]> mget(Collection<String> keys) {
        return null;
    }

    public Long lpush(String key, String members) {
        return null;
    }

    public Long expire(String key, int seconds) {
        return null;
    }

    public Long llen(String key) {
        return null;
    }

    public byte[] rpop(String key) {
        return new byte[0];
    }

    public Boolean setnx(String key, String data) {
        return null;
    }

    public Set<String> keys(String pattern) {
        return null;
    }

    public Long scard(String key) {
        return null;
    }

    public Long srem(String key, String... members) {
        return null;
    }

    public Boolean exists(String key) {
        return null;
    }

    public String sget(String key) {
        return null;
    }

    public Boolean set(String key, String data) {
        return null;
    }
}
