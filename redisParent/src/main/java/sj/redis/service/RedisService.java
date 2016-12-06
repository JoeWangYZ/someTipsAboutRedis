package sj.redis.service;

import java.util.List;
import java.util.Map;

/**
 * Created by Joe Wang on 2016/11/29.
 */
public interface RedisService {

    boolean saveListMapValue(final List<Map<String, Object>> values);
}
