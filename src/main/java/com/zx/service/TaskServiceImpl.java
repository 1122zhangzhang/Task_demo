package com.zx.service;

import com.zx.bean.Task;
import com.zx.dao.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * title:UserServiceImpl
 * 用户操作实现类
 */
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao taskDao;

    @Override
    public boolean addUser(Task task){
        boolean flag = false;
        try {
            taskDao.addUser(task);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return  flag;
    }

    @Override
    public boolean updateUser(Task task){
        boolean flag = false;
        try {
            taskDao.updateUser(task);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int id){
       boolean flag = false;
        try {
            taskDao.deleteUser(id);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Task findUserByName(String userName){
        return  taskDao.findByName(userName);
    }

    @Override
    public List<Task> findAll(){
        return taskDao.findAll();
    }


}
