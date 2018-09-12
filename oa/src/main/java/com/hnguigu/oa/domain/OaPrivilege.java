package com.hnguigu.oa.domain;

import java.util.Objects;

public class OaPrivilege {
    private Integer privilegeId;

    private String privilegeName;

    private String privilegeUrl;

    private Integer privilegeLevel;

    private String privilegeIsLeaf;

    private String privilegeIsModule;

    private Integer parentId;

    private String privilegeCode;

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName == null ? null : privilegeName.trim();
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl == null ? null : privilegeUrl.trim();
    }

    public Integer getPrivilegeLevel() {
        return privilegeLevel;
    }

    public void setPrivilegeLevel(Integer privilegeLevel) {
        this.privilegeLevel = privilegeLevel;
    }

    public String getPrivilegeIsLeaf() {
        return privilegeIsLeaf;
    }

    public void setPrivilegeIsLeaf(String privilegeIsLeaf) {
        this.privilegeIsLeaf = privilegeIsLeaf == null ? null : privilegeIsLeaf.trim();
    }

    public String getPrivilegeIsModule() {
        return privilegeIsModule;
    }

    public void setPrivilegeIsModule(String privilegeIsModule) {
        this.privilegeIsModule = privilegeIsModule == null ? null : privilegeIsModule.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPrivilegeCode() {
        return privilegeCode;
    }

    public void setPrivilegeCode(String privilegeCode) {
        this.privilegeCode = privilegeCode == null ? null : privilegeCode.trim();
    }

    @Override
    public String toString() {
        return "OaPrivilege{" +
                "privilegeId=" + privilegeId +
                ", privilegeName='" + privilegeName + '\'' +
                ", privilegeUrl='" + privilegeUrl + '\'' +
                ", privilegeLevel=" + privilegeLevel +
                ", privilegeIsLeaf='" + privilegeIsLeaf + '\'' +
                ", privilegeIsModule='" + privilegeIsModule + '\'' +
                ", parentId=" + parentId +
                ", privilegeCode='" + privilegeCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OaPrivilege that = (OaPrivilege) o;
        return Objects.equals(privilegeId, that.privilegeId) &&
                Objects.equals(privilegeName, that.privilegeName) &&
                Objects.equals(privilegeUrl, that.privilegeUrl) &&
                Objects.equals(privilegeLevel, that.privilegeLevel) &&
                Objects.equals(privilegeIsLeaf, that.privilegeIsLeaf) &&
                Objects.equals(privilegeIsModule, that.privilegeIsModule) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(privilegeCode, that.privilegeCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privilegeId, privilegeName, privilegeUrl, privilegeLevel, privilegeIsLeaf, privilegeIsModule, parentId, privilegeCode);
    }
}