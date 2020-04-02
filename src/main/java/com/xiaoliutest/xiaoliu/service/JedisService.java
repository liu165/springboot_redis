package com.xiaoliutest.xiaoliu.service;

import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaoliu
 * @date 2020/4/1 17:21
 */
@Service
public class JedisService {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    /**
     * 把id存到数据库
     *
     * @param id
     * @return
     */
    public void saveInt(String id){
            //jwt不需要验证
            redisTemplate.opsForValue().set("id",id,10L, TimeUnit.SECONDS);

//        redisTemplate.opsForValue().
     }

}
