package com.example.controlwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {
    WebView direccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        direccion = (WebView) findViewById(R.id.wvb);
        String url = getIntent().getStringExtra("SitioWeb");
        direccion.setWebViewClient(new WebViewClient());
        direccion.loadUrl("http://"+url);
    }

    public void Cerrar(View view) {
        finish();
    }
}