package com.example.titlebar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TitleView title_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title_view=findViewById(R.id.title_view);
        title_view.setTitleText("标题");
        title_view.setLeftButtonText("返回");
        title_view.setRightButtonText("编辑");
    }
}
