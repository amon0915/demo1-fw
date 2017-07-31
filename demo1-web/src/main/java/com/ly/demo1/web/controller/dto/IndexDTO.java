package com.ly.demo1.web.controller.dto;

/**
 * Created by yk48631 on 2017/7/31.
 */
public class IndexDTO {
    private String appName;
    private String owner;
    private String description;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
