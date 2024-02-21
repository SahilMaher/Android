package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
 {

    String animalList[] = new String[]{"Lion", "Tiger", "Monkey", "Elephant", "Dog", "Cat", "Camel"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.lst1);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, animalList);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);


    }

     @Override
     public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
         Toast.makeText(getApplicationContext(), animalList[position], Toast.LENGTH_LONG).show();

     }

     @Override
     public void onNothingSelected(AdapterView<?> adapterView) {

     }
 }