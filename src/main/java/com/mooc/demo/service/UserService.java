package com.mooc.demo.service;

import com.mooc.demo.Entity.User;
import com.mooc.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //查找新用户
    public User findById(Integer id) {
        return userRepository.findById(id).get();
    }

    //创建新用户
    public void creat(User user) {
        userRepository.save(user);
    }

    //更新
    public void update(User user) {
        userRepository.save(user);
    }

    //删除
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

}
