package com.mayikt.entity;/*
* 作    者 ：蚂蚁课堂-余胜军
* 版 本 号 ：v1.0.0.0
*******************************************************************
* 版权由每特教育-蚂蚁课堂-余胜军所有 微信yushengjun644 QQ644064779
* 官方网址:www.mayikt.com 员工对象
*******************************************************************
//----------------------------------------------------------------*/

public class EmpEntity {
    private String name;
    private String addres;

    /**
     * 员工属于那个部门
     */
    private DeptEntity deptEntity;

    public DeptEntity getDeptEntity() {
        return deptEntity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setDeptEntity(DeptEntity deptEntity) {
        this.deptEntity = deptEntity;
    }

    @Override
    public String toString() {
        return "EmpEntity{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                ", deptEntity=" + deptEntity +
                '}';
    }
}
