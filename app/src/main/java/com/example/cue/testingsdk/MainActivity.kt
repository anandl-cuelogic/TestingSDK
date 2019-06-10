package com.example.cue.testingsdk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.cue.toastlibrary.CustomToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            CustomToast.showToast(this, "Hi This is toast message showing library")
        }
    }
}
