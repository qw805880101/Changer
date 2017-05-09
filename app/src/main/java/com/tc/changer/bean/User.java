package com.tc.changer.bean;

import java.io.Serializable;

/**
 * 作者：tc on 2017/4/10.
 * 邮箱：qw805880101@qq.com
 * 版本：v1.0
 */
public class User implements Serializable {

    private String mobile;
    private String password;
    private String name;
    private String resCode;
    private String resDes;
    private String userId;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResDes() {
        return resDes;
    }

    public void setResDes(String resDes) {
        this.resDes = resDes;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", resCode='" + resCode + '\'' +
                ", resDes='" + resDes + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
