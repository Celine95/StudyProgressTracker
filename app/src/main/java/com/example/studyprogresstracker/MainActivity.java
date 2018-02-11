package com.example.studyprogresstracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hi");


    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
       //右侧菜单键
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }
    */
}
