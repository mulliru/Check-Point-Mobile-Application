package com.example.cp2_2158

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnEntrar: Button
    private lateinit var img_time: ImageView
    private lateinit var txtBemvindo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnEntrar = findViewById(R.id.btn_entrar)
        img_time = findViewById(R.id.img_time)
        txtBemvindo = findViewById(R.id.txt_bemvindo)



        btnEntrar.setOnClickListener {
            val fragment = fragment_teste()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container_view, fragment)
            transaction.commit()

            btnEntrar.visibility = View.GONE
            img_time.visibility = View.GONE
            txtBemvindo.visibility = View.GONE

        }
    }
}