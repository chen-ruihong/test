package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      初始化一个adapter
//        ArrayAdapter<String> teacherAdapter =
//                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Teacher.getAllTeacher());

        TeacherAdapter teacherAdapter =
                new TeacherAdapter(this, R.layout.teacher_item, Teacher.getAllTeacher());

//      通过ID获取listView
        ListView listView = (ListView) findViewById(R.id.teacher_listView);

//      设置listView的Adapter
        listView.setAdapter(teacherAdapter);
    }
}
