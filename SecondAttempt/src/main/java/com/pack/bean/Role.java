package com.pack.bean;

/**
 * Created by 10108701 on 2016/12/01.
 */
public class Role {
    private Integer id;
    private String rolename;

    public Role(Integer id, String rolename) {
        this.id = id;
        this.rolename = rolename;
    }

    public Role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
