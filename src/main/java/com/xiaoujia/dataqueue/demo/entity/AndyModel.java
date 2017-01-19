package com.xiaoujia.dataqueue.demo.entity;

/**
 * java bean 实例
 * Created by Andy
 * email zhaohuaan0925@163.com
 * created 2017/1/6 13:06
 */
public class AndyModel {

    private int id;

    private String name;

    public AndyModel() {
    }

    public AndyModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AndyModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
