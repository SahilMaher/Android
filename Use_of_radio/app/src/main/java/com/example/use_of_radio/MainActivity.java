package com.example.use_of_radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    RadioGroup rg;
    RadioButton rm,rf,ro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        rg=findViewById(R.id.rg);
        rm=findViewById(R.id.male);
        rf=findViewById(R.id.female);
        ro=findViewById(R.id.other);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(rm.isChecked())
                {
                    tv.setText("Male");
                }
                else if(rf.isChecked())
                {
                    tv.setText("Female");
                }
                else if(ro.isChecked())
                {
                    tv.setText("Other");
                }
            }
        });

    }
}