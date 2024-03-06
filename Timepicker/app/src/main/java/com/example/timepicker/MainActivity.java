package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {


    Button btn;
    TimePickerDialog tmpd;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TimePicker tmp=findViewById(R.id.timep);
//        TextView tv=findViewById(R.id.txt_view);
//        tmp.setIs24HourView(false);
//        tmp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
//                tv.setText(tmp.getCurrentHour()+":"+tmp.getCurrentMinute());
//            }
//        });
        btn=findViewById(R.id.pick_time_button);
        tv=findViewById(R.id.preview_picked_time_textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpd=new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        Time time = new Time(i,i1,0);
                        SimpleDateFormat smtd=new SimpleDateFormat("h:mm");
                        tv.setText(smtd.format(time));
                    }
                },0,0,false); tmpd.show();


            }

        });
    }
}