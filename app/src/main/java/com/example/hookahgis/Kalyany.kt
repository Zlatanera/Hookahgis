package com.example.hookahgis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kalyany : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalyany)
    }
    fun Kalyany(view: View){
        val IntentOrder = Intent(applicationContext, Kalyany::class.java)
        startActivity(IntentOrder)
        /*
        IntentOrder - локальная переменная, так что в данные две строки можно использовать
        как образец для перехода на другое активити, меняя "Login::class.java"
        */
    }

}
