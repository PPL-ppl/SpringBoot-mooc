package com.mooc.demo.controll;

import com.mooc.demo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/set")
    public void set(@RequestBody Student stu){
        redisTemplate.opsForValue().set("stu",stu);
        System.out.println(stu.toString());
    }
    @GetMapping("/get/{id}")
    public Student get(@PathVariable("id") String id) {
        return (Student) redisTemplate.opsForValue().get(id);
    }
    @DeleteMapping("/del/{id}")
    public boolean del(@PathVariable("id") String id){
        redisTemplate.delete(id);
        return redisTemplate.hasKey(id);
    }
    @GetMapping("/hash")
    public void hash(){
        HashOperations<String,String,String> hashOperations = redisTemplate.opsForHash();
        hashOperations.put("key","hashKey","hashV");
        hashOperations.put("key2","hashKey","hashV");
        hashOperations.put("key","hashKey2","hashV2");
        hashOperations.put("key","hashKey3","hashV3");
        System.out.println(hashOperations.get("key","hashKey"));//hashV
        System.out.println(hashOperations.get("key2","hashKey"));//hashV
        System.out.println(hashOperations.get("key","hashKey2"));//hashV2
    }
}
