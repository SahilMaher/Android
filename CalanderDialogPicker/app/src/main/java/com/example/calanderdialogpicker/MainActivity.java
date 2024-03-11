package com.example.calanderdialogpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText etd;
    DatePickerDialog dp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etd=findViewById(R.id.edt);
        etd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        Date dt=new Date(i,i1,i2);
                        String Formate="dd/mm/yy";
                        SimpleDateFormat sm=new SimpleDateFormat(Formate, Locale.ENGLISH);
                        etd.setText(sm.format(dt));
                    }
                },0,0,0);
                dp.show();
            }
        });

    }

}