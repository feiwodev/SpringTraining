package com.zeno.bean;

import org.springframework.stereotype.Component;

@Component
public class Config {

    private String user;
    private String permissions;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Config{" +
                "user='" + user + '\'' +
                ", permissions='" + permissions + '\'' +
                '}';
    }
}
