package com.kentrasoft.entity;

public class User {
    private String id;//用户id
    private String userCode;//用户编码
    private String userName;//用户名称
    private String password;//用户密码
    private String userAccount;//用户账号
    private String userPhone;//手机号
    private String userRights;//权限
    private String roleId;//角色id
    private char status;//用户状态 1：正常  2：注销 3：黑名单 4：离职

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserRights() {
        return userRights;
    }

    public void setUserRights(String userRights) {
        this.userRights = userRights;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
