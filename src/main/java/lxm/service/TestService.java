package lxm.service;

import lxm.mapper.TestMapper;
import lxm.model.Test;
import lxm.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;
    @Autowired
    private RedisUtil redisUtil;

    public Test queryById(String id) {
        System.out.println(redisUtil.get("test"));
        return testMapper.selectByPrimaryKey(Integer.parseInt(id));
    }
}
