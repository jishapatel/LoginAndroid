package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv = (TextView) findViewById(R.id.textView1);
        TextView tv1 = (TextView) findViewById(R.id.textView2);
        tv.setText("Username is :  "+getIntent().getExtras().getString("username"));
        tv1.setText("Password is :  "+getIntent().getExtras().getString("password"));
    }
}