package com.example.login_using_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
Button btn,btn2;
EditText e_unm,e_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent in2= getIntent();
        String n_unm=in2.getStringExtra("new_unm");
        String u_pass=in2.getStringExtra("new_pass");
        btn=findViewById(R.id.btn_login);
        e_unm=findViewById(R.id.edt_unm);
        e_pass=findViewById(R.id.edt_pass);
//        String Unm=e_unm.getText().toString();
//        String pass=e_pass.getText().toString();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e_unm.getText().toString().equals(n_unm) && e_pass.getText().toString().equals(u_pass)  )
              {
                   Intent in=new Intent(Login.this, MainActivity.class);
                   in.putExtra("user",e_unm.getText().toString());
                   startActivity(in);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Try Again",Toast.LENGTH_LONG).show();
                }
            }
        });
        btn2=findViewById(R.id.btn_l_sign);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Login.this,SignIn.class);
                startActivity(in);

            }
        });
    }
}