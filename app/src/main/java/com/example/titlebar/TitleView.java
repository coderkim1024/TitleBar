package com.example.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class TitleView extends FrameLayout {
    private Button bt_back;
    private TextView tv_title;
    private Button bt_edit;

    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);//引入布局
        bt_back=(Button)findViewById(R.id.button_left);
        tv_title=(TextView)findViewById(R.id.title_text);
        bt_edit=(Button)findViewById(R.id.button_right);
        bt_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_edit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    public void setTitleText(String text){
        tv_title.setText(text);
    }
    public void setLeftButtonText(String text){
        bt_back.setText(text);
    }
    public void setRightButtonText(String text){
        bt_edit.setText(text);
    }
    public void setLeftButtonListener(OnClickListener l){
        bt_back.setOnClickListener(l);
    }
    public void setRightButtonListener(OnClickListener l){
        bt_edit.setOnClickListener(l);
    }
}
