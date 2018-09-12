package com.hnguigu.oa.domain;

import java.util.List;
import java.util.Set;

public class OaRolePrivilege {
    private Integer rolePrivilegeId;

    private List<OaRole> roles;

    private List<OaPrivilege> privileges;

    public Integer getRolePrivilegeId() {
        return rolePrivilegeId;
    }

    public void setRolePrivilegeId(Integer rolePrivilegeId) {
        this.rolePrivilegeId = rolePrivilegeId;
    }

    public List<OaRole> getRoles() {
        return roles;
    }

    public void setRoles(List<OaRole> roles) {
        this.roles = roles;
    }

    public List<OaPrivilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<OaPrivilege> privileges) {
        this.privileges = privileges;
    }

    @Override
    public String toString() {
        return "OaRolePrivilege{" +
                "rolePrivilegeId=" + rolePrivilegeId +
                ", roles=" + roles +
                ", privileges=" + privileges +
                '}';
    }


}