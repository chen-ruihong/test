package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private int imageId;
    private String desc;

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    //  构造函数
    public Teacher(String name, int imageId, String desc){
        this.name = name;
        this.imageId = imageId;
        this.desc = desc;
    }

//  返回一个Teacher的列表
    public static List<Teacher> getAllTeacher(){
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("chen", R.drawable.chen, "chen,北京大学教授国际大学生"));
        teachers.add(new Teacher("rui", R.drawable.rui, "rui,北京大学信息科技学院"));
        teachers.add(new Teacher("hong", R.drawable.hong, "hong,北京大学软件工程"));
        return teachers;
    }
}
