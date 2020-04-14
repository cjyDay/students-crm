package com.students.studentcrm.entity;



import java.io.Serializable;

public class BaseEntity implements Serializable {

    private String createTime;
    private String updateTime;
    private Integer isDel;

    public String getCreateTime() {
        return createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }


}
