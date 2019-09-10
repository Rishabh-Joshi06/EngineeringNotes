package com.example.engineeringnotes.subject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.engineeringnotes.R;

public class py extends AppCompatActivity {

String myPdfUrl="https://drive.google.com/file/d/1l4wHuSGJ9Ur2N5Z0F6ZI7GpesfHz-sJp/view?usp=sharing";
    WebView webView;
@SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


    super.onCreate(savedInstanceState);
        setContentView(R.layout.python);
      webView=findViewById(R.id.webview);
      displayWebView();
}

    private void displayWebView(){
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    view.loadUrl(myPdfUrl);
                    return true;
                }
            });
            webView.loadUrl(myPdfUrl);
        }
    }

