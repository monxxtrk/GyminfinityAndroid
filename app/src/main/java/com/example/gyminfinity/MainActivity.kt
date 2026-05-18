package com.example.gyminfinity

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    // --------------------------------------------------------------------------------
    // Ciclo de vida de la actividad
    // --------------------------------------------------------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)

        webView.webViewClient = WebViewClient()

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true

        // CAMBIA ESTA URL POR LA DE TU WEB
        webView.loadUrl("https://TU-WEB.onrender.com")
    }

    // --------------------------------------------------------------------------------
    // Manejo del botón Atrás
    // --------------------------------------------------------------------------------
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
