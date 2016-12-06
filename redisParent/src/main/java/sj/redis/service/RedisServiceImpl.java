package sj.redis.service;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import sj.redis.pool.RedisClient;
import sun.org.mozilla.javascript.internal.json.JsonParser;

import java.util.List;
import java.util.Map;


/**
 * Created by Joe Wang on 2016/11/29.
 */
public class RedisServiceImpl<T> implements RedisService{

    private RedisClient redisClient;
    private String key;

    public RedisServiceImpl(RedisClient redisClient, String key) {
        this.redisClient = redisClient;
        this.key = key;
    }

    public boolean saveListMapValue(final List<Map<String, Object>> values) {
        if (null == values) {
            return Boolean.TRUE;
        }
        List<Map<String, Object>> valueClone;
        try {
            //clone a new list, avoid fast-fail
            valueClone = Lists.newArrayList();
            valueClone.addAll(values);

            this.redisClient.set(key, JSONObject.toJSONBytes(valueClone));
        } catch (Exception e) {
            //error
            return Boolean.FALSE;
        }

        return false;
    }
}
