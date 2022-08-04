package org.ds.notes.controller;

import org.ds.notes.dao.UserReposiroty;
import org.ds.notes.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xingbm on 2021/1/10 18:07
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserReposiroty userReposiroty;

    @PostMapping("/insert")
    @ResponseBody
    public Map<String, Object> insert(@RequestBody User user) {
        userReposiroty.save(user);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("data", "");
        return map;
    }

    @GetMapping("/list")
    @ResponseBody
    public Map<String, Object> list() {
        List<User> userList = userReposiroty.findAll();
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("data", userList);
        return map;
    }

}
