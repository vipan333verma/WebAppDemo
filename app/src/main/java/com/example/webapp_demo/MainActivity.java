package com.example.webapp_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    WebView webView;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initView

        webView=findViewById(R.id.webview);
        mButton=findViewById(R.id.loadpage);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //can enter any url
                webView.loadUrl("https://www.google.com/");
                webView.canGoBack();
                webView.canGoForward();
            }
        });



    }
}
