package com.mooc.demo.controll;

import com.mooc.demo.Entity.MongoStudent;
import com.mooc.demo.Repository.MongoStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MongoController {

    @Autowired
    private MongoStudentRepository mongoStudentRepository;

    @GetMapping("/findall")
    public List<MongoStudent> findAll() {
        return mongoStudentRepository.findAll();
    }

    @GetMapping("/Mget/{id}")
    public MongoStudent findById(@PathVariable("id") String id) {
        MongoStudent mongoStudent = mongoStudentRepository.findById(id).get();
        MongoStudent byId = mongoStudentRepository.getById(id);//与上同理 这个为自定义的
        System.out.println(byId);
        return mongoStudent;
    }

    @PostMapping("/Msave")
    public MongoStudent save(@RequestBody MongoStudent mongoStudent) {
        MongoStudent save = mongoStudentRepository.save(mongoStudent);
        System.out.println(save.toString());
        return save;
    }

    @PutMapping("/update")
    public MongoStudent update(@RequestBody MongoStudent mongoStudent) {
        return mongoStudentRepository.save(mongoStudent);
    }
    @DeleteMapping("/Mdel/{id}")
    public void delById(@PathVariable("id") String id){
        mongoStudentRepository.deleteById(id);
    }

}
