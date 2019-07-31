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

    fun Kalyany(view: View) {
        val kalyani = Intent(applicationContext, Kalyany::class.java)
        startActivity(kalyani)
    }

    fun where_to_smoke(view: View){
        val hookah_place = Intent(this, gde_kurim::class.java)
        startActivity(hookah_place)
    }
}
