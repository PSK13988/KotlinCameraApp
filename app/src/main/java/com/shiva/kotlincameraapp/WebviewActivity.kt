package com.shiva.kotlincameraapp

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.webkit.WebChromeClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_webview.*;
import kotlinx.android.synthetic.main.brower_toolbar.*;

class WebviewActivity : AppCompatActivity() {
    private val TAG: String = "WebviewActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        edUrl.setOnEditorActionListener { textView, i, keyEvent ->
            if (i.equals(EditorInfo.IME_ACTION_SEND)) {
                if (!edUrl.text.isNullOrEmpty()) {
                    Log.d(TAG, "Loading url : ${edUrl.text}")
                    loadWebpage(edUrl.text.toString())
                } else
                    Toast.makeText(applicationContext, "Please enter valid url", Toast.LENGTH_LONG).show()
                true
            } else false
        }

    }

    fun buildUri(authority: String): Uri {
        return Uri.Builder().scheme("https").authority(authority).build()
    }

    fun loadWebpage(url: String): Unit {
        webView.loadUrl("")
        val url = buildUri(url)
        webView.settings.javaScriptEnabled = true

        webView.webChromeClient = WebChromeClient()
        webView.loadUrl(url.toString())
    }
}
