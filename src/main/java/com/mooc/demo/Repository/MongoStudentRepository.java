package com.mooc.demo.Repository;

import com.mooc.demo.Entity.MongoStudent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoStudentRepository extends MongoRepository<MongoStudent,String> {
    MongoStudent getById(String id);
}
