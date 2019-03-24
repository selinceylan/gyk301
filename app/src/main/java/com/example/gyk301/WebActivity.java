package com.example.gyk301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView webview = (WebView) findViewById(R.id.web);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://gelecegiyazanlar.turkcell.com.tr");
    }


}
