package com.example.hookahgis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gde_kurim : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gde_kurim)
    }

    fun back_to_menu(view: View){
        val go_back = Intent(this, Hookah_menu::class.java)
        startActivity(go_back)
    }
}
