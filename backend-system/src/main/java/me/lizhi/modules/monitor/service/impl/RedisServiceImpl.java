package me.lizhi.modules.monitor.service.impl;

import me.lizhi.modules.monitor.domain.vo.RedisVo;
import me.lizhi.modules.monitor.service.RedisService;
import me.lizhi.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    JedisPool pool;

    @Override
    public Page findByKey(String key, Pageable pageable){
        Jedis jedis = null;
        try{
            jedis = pool.getResource();
            List<RedisVo> redisVos = new ArrayList<>();

            if(!key.equals("*")){
                key = "*" + key + "*";
            }
            for (String s : jedis.keys(key)) {
                RedisVo redisVo = new RedisVo(s,jedis.get(s));
                redisVos.add(redisVo);
            }
            Page<RedisVo> page = new PageImpl<RedisVo>(
                    PageUtil.toPage(pageable.getPageNumber(),pageable.getPageSize(),redisVos),
                    pageable,
                    redisVos.size());
            return page;
        }finally{
            if(null != jedis){
                jedis.close(); // 释放资源还给连接池
            }
        }

    }

    @Override
    public void save(RedisVo redisVo) {
        Jedis jedis = null;
        try{
            jedis = pool.getResource();
            jedis.set(redisVo.getKey(),redisVo.getValue());
        }finally{
            if(null != jedis){
                jedis.close(); // 释放资源还给连接池
            }
        }
    }

    @Override
    public void delete(String key) {
        Jedis jedis = null;
        try{
            jedis = pool.getResource();
            jedis.del(key);
        }finally{
            if(null != jedis){
                jedis.close(); // 释放资源还给连接池
            }
        }
    }

    @Override
    public void flushdb() {
        Jedis jedis = null;
        try{
            jedis = pool.getResource();
            jedis.flushAll();
        }finally{
            if(null != jedis){
                jedis.close(); // 释放资源还给连接池
            }
        }

    }
}
