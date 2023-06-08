package com.mayikt.entity;/*
* 作    者 ：蚂蚁课堂-余胜军
* 版 本 号 ：v1.0.0.0
*******************************************************************
* 版权由每特教育-蚂蚁课堂-余胜军所有 微信yushengjun644 QQ644064779
* 官方网址:www.mayikt.com 
*******************************************************************
//----------------------------------------------------------------*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StuEntity {
    /**
     * 1.注入数组类型
     * 2.注入list集合类型
     * 3.注入Map集合类型属性
     * 4.注入set集合属性
     */
    private String[] arrays;
    private List<String> list;
    private Map<String, String> map;
    private Set<String> set;
    /**
     * 一个学生学习n多门的课程 java、大数据等
     */
    private List<CourseEntity> courses;


    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StuEntity{" +
                "arrays=" + Arrays.toString(arrays) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", courses=" + courses +
                '}';
    }
}
