package com.ssm.base.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
public class BasePermission implements Serializable {
    private String id;

    private String name;

    private String pid;

    private String url;

    private String description;

    private Integer level;

    public BasePermission(String id, String name, String pid, String url, String description, Integer level) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.url = url;
        this.description = description;
        this.level = level;
    }

    public BasePermission() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}