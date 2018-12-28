package com.shiva.kotlincameraapp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_video_view.*

class VideoViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view)

        btnVideoRecord.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            if (cameraIntent.resolveActivity(packageManager) != null) {
                startActivityForResult(cameraIntent, cameraRequestCode)
            }
        }
    }

    private val cameraRequestCode = 1

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            cameraRequestCode -> {
                if (resultCode == Activity.RESULT_OK && data != null)
                    ivCapturedVideo.setVideoURI(data.data)
            }
            else -> {
                Toast.makeText(applicationContext, "Unresolved Request code", Toast.LENGTH_LONG).show()
            }
        }
    }
}
