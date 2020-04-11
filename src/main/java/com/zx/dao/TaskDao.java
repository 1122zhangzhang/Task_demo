package com.zx.dao;
/** dao 数据操作层**/

import com.zx.bean.Task;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * 使用spring的JPA来完成基本的增删改查
 * 使用注解@insert @select @update @delete来完成增删改查
 */
@Mapper  //接口上添加了这个注解表示这个接口是基于注解实现的CRUD
public interface TaskDao {
    /**
     * 用户数据新增
     */
    @Insert("insert into t_user(id,name,age) values(#{id},#{name},#{age})")
    void addUser(Task task);

    /**
     * 用户数据修改
     */
    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(Task task);

    /**
     * 用户数据删除
     */
    @Delete("delete from t_user where id=#{id}")
    void deleteUser(int id);

    /**
     * 根据用户名称查询用户信息
     */
    @Select("select id,name,age from t_user where name=#{name}")
    Task findByName(@Param("userName")  String userName);

    /**
     * 查询所有
     */
    @Select("select id,name,age from t_user")
    List<Task> findAll();
/**
 * Results: 返回的map结果集，property 表示User类的字段，column 表示对应数据库的字段
 * Param:sql条件的字段
 */
}
