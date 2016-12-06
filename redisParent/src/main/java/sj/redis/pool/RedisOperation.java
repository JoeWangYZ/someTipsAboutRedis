package sj.redis.pool;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Joe Wang on 2016/11/29.
 */
public interface RedisOperation {
    /**
     * Get the value of the specified key
     *
     * @param key
     * @return
     */
    byte[] get(String key);

    /**
     * hget
     *
     * @param key
     * @param field
     * @return
     */
    String hget(String key, String field);

    /**
     * Set the bytes value as value of the key
     *
     * @param key
     * @param data
     * @return
     */
    Boolean set(String key, byte[] data);

    Boolean hmset(String key, Map<String, String> map);

    Boolean hmultiset(String key, Map<String, byte[]> map);

    Long hset(String key, String field, String value);

    Long hset(String key, String field, byte[] value);

    List<String> hmget(String key, String... fields);

    List<byte[]> hmultiget(String key, String... fields);

    Map<String,String> hmgetall(String key);

    Map<String, byte[]> hgetall(String key);

    Boolean hdel(String key, String... field);

    Set<String> hkeys(String key);

    /**
     * Set the bytes value as value of the key with expire time
     *
     * @param key
     * @param data
     * @param exp  0 means no expire time. above zero is expire time. unit
     *             second
     * @return
     */
    Boolean set(String key, byte[] data, int exp);

    /**
     * Remove the specified keys.
     *
     * @param key
     * @return
     */
    Boolean del(String key);


    /**
     * Add the specified member to the set value stored at key
     *
     * @param key
     * @param members
     * @return
     */
    Long sadd(String key, String... members);

    /**
     * Return all the members (elements) of the set value stored at key
     *
     * @param key
     * @return
     */
    Set<String> smembers(String key);

    /**
     * Return ture if member is a member of the set stored at key, otherwise false is
     * returned.
     * <p>
     * Time complexity O(1)
     *
     * @param key
     * @param member
     * @return Boolean reply, specifically: ture if the element is a member of the
     * set false if the element is not a member of the set OR if the key
     * does not exist
     */
    public Boolean sismember(final String key, final String member);

    /**
     * Set the the respective keys to the respective values.
     *
     * @param keyDatas
     * @return
     */
    Boolean mset(Map<String, byte[]> keyDatas);

    /**
     * Get the values of all the specified keys.
     *
     * @param keys
     * @return
     */
    Map<String, byte[]> mget(Collection<String> keys);

    /**
     * left add
     *
     * @param key
     * @param members
     * @return
     */
    Long lpush(String key, String members);

    /**
     * expire time
     *
     * @param key
     * @param seconds
     * @return
     */
    Long expire(String key, int seconds);

    /**
     * rerurn size
     *
     * @param key
     * @return
     */
    Long llen(String key);

    /**
     * return right
     *
     * @param key
     * @return
     */
    byte[] rpop(String key);

    /**
     * Set the string value as value of the key
     *
     * @param key
     * @param data
     * @return
     */
    Boolean setnx(String key, String data);

    /**
     * Returns all the keys matching the glob-style pattern as space separated
     * strings. For example if you have in the database the keys "foo" and
     * "foobar" the command "KEYS foo*" will return "foo foobar".
     *
     * @param pattern
     * @return
     */
    Set<String> keys(String pattern);

    /**
     * Return the set cardinality (number of elements). If the key does not
     * exist 0 is returned, like for empty sets.
     *
     * @param key
     * @return
     */
    Long scard(String key);

    /**
     * Remove the specified member from the set value stored at key. If member
     * was not a member of the set no operation is performed. If key does not
     * hold a set value an error is returned.
     * <p>
     * Time complexity O(1)
     *
     * @param key
     * @param members
     * @return
     */
    Long srem(String key, String... members);

    /**
     * @param key
     * @return
     */
    Boolean exists(String key);

    String sget(String key);

    Boolean set(String key, String data);
}


