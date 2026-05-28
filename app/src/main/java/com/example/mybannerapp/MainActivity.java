package com.example.mybannerapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        myWebView = new WebView(this);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        
        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        // ഗൂഗിൾ ഡ്രൈവ് ഡയറക്റ്റ് ലിങ്ക് ഇവിടെ നൽകുക
        myWebView.loadUrl("https://drive.google.com/drive/folders/1A5rY_ImMe0MjZkh-l9RIb2cViptSmBu2");
        setContentView(myWebView);
    }
}
