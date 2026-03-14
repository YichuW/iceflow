package com.iceflow.entity;

import java.time.LocalDateTime;

/**
 * 这是一个用户实体类。
 *
 * “实体类”可以先理解成：
 * 用 Java 类去描述数据库里的一张表。
 *
 * 以后数据库里如果有 user 表，
 * 那么在后端里通常就会有一个 User 类和它对应。
 *
 * 这个类现在先不加数据库注解，
 * 我们先只学习“如何用 Java 表达一个业务对象”。
 */
public class User {
    /**
     * 用户 id
     *
     * 以后通常会对应数据库主键，比如：
     * user_id BIGINT / INT
     *
     * 这里先用 Long，
     * 因为主键一般更稳妥地用 Long。
     */
    private Long id;
    private String name;
    private String password;
    private String role;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public User(){

    }
    public User(Long id, String name, String password, String role, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
