package com.zx.bean;
/** bean层是实体类 数据库中只有一个表**/
public class Task {
    /** 编号 数量 名字 **/
    private int id;
    private String name;
    private int num;
    public Task(){
    }
    /**
     * 构造方法
     * @param  id 编号 name姓名
     */
    public Task(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }
    /**
     * 获取姓名 return name
     */
    public String getName(){
        return name;
    }
    /**
     * 设置name
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * 获取num return num
     */
    public int getAge(){
        return num;
    }
    /**
     * 设置num
     */
    public void setAge(int age){
        this.num = age;
    }
    /**
     * 获取编号 return id
     */
    public int getId(){
        return id;
    }
    /**
     * 设置id
     */
    public void setId(int id){
        this.id = id;
    }
}
