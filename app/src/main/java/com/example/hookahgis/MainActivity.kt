package com.example.hookahgis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Age_yes(view: View){
        val IntentOrder = Intent(applicationContext, Hookah_menu::class.java)
        startActivity(IntentOrder)
        /*
        IntentOrder - локальная переменная, так что в данные две строки можно использовать
        как образец для перехода на другое активити, меняя "Login::class.java"
        */
    }

    fun Age_no(view: View){
        Toast.makeText(this, "Вы должны быть старше 18-ти!", Toast.LENGTH_LONG
        ).show()
    }
}
