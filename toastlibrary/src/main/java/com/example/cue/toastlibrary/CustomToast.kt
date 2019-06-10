package com.example.cue.toastlibrary

import android.content.Context
import android.widget.Toast

object CustomToast {


    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}
