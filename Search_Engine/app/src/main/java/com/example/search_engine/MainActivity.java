package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton imgbtn;
    EditText edt;
    WebView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtn=findViewById(R.id.btn);
        edt=findViewById(R.id.search);
        imgv=findViewById(R.id.web);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link1=edt.getText().toString();
                WebView webView = findViewById(R.id.web);


                webView.loadUrl("https://"+link1+".com");


                webView.getSettings().setJavaScriptEnabled(true);


                webView.setWebViewClient(new WebViewClient());
            }
        });

    }
}