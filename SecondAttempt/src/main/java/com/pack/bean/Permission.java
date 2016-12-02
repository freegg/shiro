package com.pack.bean;

/**
 * Created by 10108701 on 2016/12/01.
 */
public class Permission {
    private Integer id;
    private String permissionname;
    private Integer roleid;

    public Permission(Integer id, String permissionname, Integer roleid) {
        this.id = id;
        this.permissionname = permissionname;
        this.roleid = roleid;
    }

    public Permission() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permissionname='" + permissionname + '\'' +
                ", roleid=" + roleid +
                '}';
    }
}
