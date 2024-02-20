package com.example.login_using_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.txt_unm);
        Intent in= getIntent();
        String Uname=in.getStringExtra("user");
        tv.setText("Hello " +Uname+"\n Login Sucsesfully");


    }
}