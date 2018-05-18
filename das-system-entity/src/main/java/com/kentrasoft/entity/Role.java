package com.kentrasoft.entity;

public class Role {
    private String id;//角色id
    private String roleCode;//角色code
    private String roleName;//角色名称
    private String roleRights;//角色权限
    private char status;//角色状态 1:政正常 2：禁用

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleRights() {
        return roleRights;
    }

    public void setRoleRights(String roleRights) {
        this.roleRights = roleRights;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
