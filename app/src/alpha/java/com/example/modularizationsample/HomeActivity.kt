package com.example.modularizationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<TextView>(R.id.tvHomeMessage).text = "${getString(R.string.app_name)}\nIS_IMAGE_LOADING_ENABLE: ${BuildConfig.IS_IMAGE_LOADING_ENABLED}"
    }
}