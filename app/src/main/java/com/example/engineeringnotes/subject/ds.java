package com.example.engineeringnotes.subject;

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

import androidx.appcompat.app.AppCompatActivity;

import com.example.engineeringnotes.R;

public class ds extends AppCompatActivity {

    String myPdfUrl="https://drive.google.com/file/d/1Le5LbrGsCdEe6LP4rfwKfQK9ZEHf5_K3/view?usp=sharing";
    WebView webView;
    Button bn;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ds);
        webView = findViewById(R.id.dswebview);
        displayWebView();
        bn = findViewById(R.id.dsdownload);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent download = new Intent(Intent.ACTION_VIEW);
                String url ="https://drive.google.com/file/d/1Le5LbrGsCdEe6LP4rfwKfQK9ZEHf5_K3/view?usp=sharing";
                download.setData(Uri.parse(url));

                startActivity(download);
            }
        });
    }

    private void displayWebView() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
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




