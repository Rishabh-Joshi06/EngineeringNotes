package com.example.engineeringnotes.sub3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.engineeringnotes.R;

public class ENTER extends AppCompatActivity {

    String myPdfUrl="https://drive.google.com/file/d/1l4wHuSGJ9Ur2N5Z0F6ZI7GpesfHz-sJp/view?usp=sharing";
    WebView webView;
    Button bn;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        webView=findViewById(R.id.webview);
        displayWebView();
        bn=findViewById(R.id.download);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent download = new Intent(Intent.ACTION_VIEW);
                String url = "https://drive.google.com/uc?authuser=0&id=1l4wHuSGJ9Ur2N5Z0F6ZI7GpesfHz-sJp&export=download";
                download.setData(Uri.parse(url));

                startActivity(download);
            }
        });
    }

    private void displayWebView(){
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(myPdfUrl);
                webView.getSettings().getCacheMode();
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                webView.setScrollbarFadingEnabled(false);


                webView.getSettings().setBuiltInZoomControls(true); //this works fine.

                return true;
            }
        });
        webView.loadUrl(myPdfUrl);
    }


}