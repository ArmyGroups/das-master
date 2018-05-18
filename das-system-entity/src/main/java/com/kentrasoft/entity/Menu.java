package com.kentrasoft.entity;

public class Menu {
    private String id;//菜单id
    private String menuCode;//菜单编码
    private String menuName;//菜单名称
    private String menuUrl;//菜单地址
    private String parentId;//父级id
    private char menuType;//菜单类型 1：代表父级菜单 2：菜单 3：按钮
    private char status;//菜单状态 1：正常 2：禁用

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public char getMenuType() {
        return menuType;
    }

    public void setMenuType(char menuType) {
        this.menuType = menuType;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
