package com.example.engineeringnotes.subject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.engineeringnotes.R;

public class py extends AppCompatActivity {

String myPdfUrl="https://drive.google.com/open?id=1Le5LbrGsCdEe6LP4rfwKfQK9ZEHf5_K3";
    WebView webView;
@SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

