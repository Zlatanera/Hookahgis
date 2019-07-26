package com.example.hookahgis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Hookah_menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hookah_menu)
    }
    fun Kalyany(view: View){
        val IntentOrder = Intent(applicationContext, Kalyany::class.java)
        startActivity(IntentOrder)

    }
}
