package com.example.lab1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //4.2.3: log
        Log.d("MainActivity", "Застосунок успішно запущено!")

        // Знаходимо елементи на екрані
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        //4.2.2
        textView.text = "Привіт, світ!"

        // Завдання 5 натискання кнопки
        button.setOnClickListener { view ->

            textView.text = "Текст змінено!"

            //Snackbar
            Snackbar.make(view, "Ви натиснули кнопку (Snackbar)!", Snackbar.LENGTH_LONG)
                .show()

            Log.d("MainActivity", "Кнопка була натиснута")
        }
    }
}