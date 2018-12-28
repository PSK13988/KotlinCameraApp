package com.shiva.kotlincameraapp

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCamera.setOnClickListener {
            val cameraIntent = Intent(this, CaptureImageActvity::class.java)
            startActivity(cameraIntent)
        }

        btnRecordVideo.setOnClickListener {
            val videoIntent = Intent(this, VideoViewActivity::class.java)
            startActivity(videoIntent)
        }

        btnWebview.setOnClickListener {
            val videoIntent = Intent(this, WebviewActivity::class.java)
            startActivity(videoIntent)
        }

        btnTabLayout.setOnClickListener { val tabIntent = Intent(this, TabLayoutActivity::class.java)
            startActivity(tabIntent) }
    }
}
