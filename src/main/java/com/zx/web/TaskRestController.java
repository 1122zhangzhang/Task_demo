package com.zx.web;

import com.zx.bean.Task;
import com.zx.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * RestController：默认类中的方法都会以json的格式返回
 * RequestMapping: 接口路径配置
 * method : 请求格式
 * RequestParam: 请求参数
 * 用户数据操作接口
 */
@RestController
@RequestMapping(value = "/api/user")
public class TaskRestController {
    @Autowired
    private TaskService userService;

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public boolean addUser(Task task){
        System.out.println("开始新增。。");
        return userService.addUser(task);
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public boolean updateUser(Task task){
        System.out.println("正在更新。。");
        return userService.updateUser(task);
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public boolean deleteUser(@RequestParam(value = "userName",required = true) int userId){
        System.out.println("正在删除。。");
        return userService.deleteUser(userId);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public Task findByUserName(@RequestParam(value = "userName",required = true) String userName){
        System.out.println("开始根据用户名查找用户。。");
        return userService.findUserByName(userName);
    }

    @RequestMapping(value = "/userAll",method = RequestMethod.GET)
    public List<Task> findByUserAge(){
        System.out.println("开始查询所有数据。。");
        return userService.findAll();
    }
}
