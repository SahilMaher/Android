package com.example.login_using_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
Button btn;
EditText edt_newunm,edt_newpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        btn=findViewById(R.id.btn_sign);
        edt_newpass=findViewById(R.id.edt_newpass);
        edt_newunm=findViewById(R.id.edt_newunm);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt_newpass.getText().toString().equals("") && edt_newpass.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please Enter User and Password",Toast.LENGTH_LONG).show();
                }
                else {
                    Intent in = new Intent(SignIn.this, Login.class);
                    in.putExtra("new_unm", edt_newunm.getText().toString());
                    in.putExtra("new_pass", edt_newpass.getText().toString());
                    startActivity(in);

                }
            }
        });
    }
}