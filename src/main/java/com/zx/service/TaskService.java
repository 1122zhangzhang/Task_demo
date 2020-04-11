package com.zx.service;

import com.zx.bean.Task;

import java.util.List;

/**
 * 业务逻辑层
 */
public interface TaskService {
    /**
     * 新增用户
     * @param task
     * @return
     */
    boolean addUser(Task task);

    /**
     * 修改用户
     * @param task
     * @return
     */
    boolean updateUser(Task task);

    /**
     * 删除用户
     * @param  id
     * @return
     */
    boolean deleteUser(int id);

    /**
     * 根据用户名字查询用户信息
     * @param userName
     */
    Task findUserByName(String userName);

    /**
     * 查询所有
     * @return
     */
    List<Task> findAll();
}
