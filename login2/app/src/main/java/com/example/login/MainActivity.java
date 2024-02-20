package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        e1 =findViewById(R.id.txt_name);
//        e2=findViewById(R.id.txt_pass);
//        b1=findViewById(R.id.btn_login);
//        t1=findViewById(R.id.txt_v);

       // b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String s1=e1.getText().toString();
//                String s2=e2.getText().toString();
//                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_LONG).show();
//                if(s1.equals("S") && s2.equals("S"))
//                {
//                   Toast.makeText(getApplicationContext(),"Login Succesfully",Toast.LENGTH_LONG).show();
//
//
//                }
//                else
//                {
//                 Toast.makeText(getApplicationContext(),"try Again",Toast.LENGTH_LONG).show();
//
//                }
//
//            }
//        });
    }
}