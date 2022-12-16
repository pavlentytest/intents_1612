package ru.samsung.itschool.mdev.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://mirea.ru"
        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            // неявное намерение
            //val intent = Intent(Intent.ACTION_VIEW)
           // intent.setData(Uri.parse(url))
           // startActivity(intent)
            // явное намерение
            val intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}