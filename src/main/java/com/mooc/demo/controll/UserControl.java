package com.mooc.demo.controll;

import com.mooc.demo.Entity.User;
import com.mooc.demo.Repository.UserRepository;
import com.mooc.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api
@RestController
@RequestMapping("/user")
public class UserControl {
    @Autowired
    UserService userService;

    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "分页获取用户列表")
    @GetMapping("/findAll")
    public Page<User> list(String property, String direction, Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(direction), property);
        return userRepository.findAll(pageable);
    }

    @ApiOperation(value = "按照id查找")
    @GetMapping("/getid/{id}")
    public User getById(@PathVariable("id") Integer id) {
        //User user = userRepository.findById(id).get();
        return userService.findById(id);
    }

    //创建用户
    @PostMapping("/save")
    public void save(@Valid @RequestBody User user, BindingResult bindResult) {
        if (bindResult.hasErrors()) {
            System.out.println(bindResult.getFieldError().getDefaultMessage());
            System.out.println("出错了");
        }
        userService.creat(user);
    }

    //更新用户
    @PutMapping("/update")
    public void update(@RequestBody User user) {
        userService.update(user);
    }
}
