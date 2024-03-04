package com.example.multy_text_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String[] countries={"India","Australia","West indies","indonesia","Indiana",
            "South Africa","England","Bangladesh","Srilanka","singapore"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp;

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, countries);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView);
        textView.setAdapter(adapter);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_dropdown_item_1line, countries);
        MultiAutoCompleteTextView tv = findViewById(R.id.multiAutoCompleteTextView);
        tv.setAdapter(adapter);
        tv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
//        COUNTRIES = new String[]{
//                "Belgium", "France", "Italy", "Germany", "Spain"
//        };
        sp=findViewById(R.id.spinner);
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countries);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(adapter2);
    }
}