package com.kentrasoft.utils.plugin;

import java.io.Serializable;
import java.util.List;

public class PageForm<T> implements Serializable {
    private  Integer code=0;//状态码
    private Integer page=1;//当前页
    private Integer limit=10;//每页显示条数
    private Integer count=0;
    private List<T> data; //数据

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
