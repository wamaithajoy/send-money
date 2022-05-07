package com.example.sendmoney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnSendmoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSendmoney=findViewById(R.id.btnSendmoney)
        btnSendmoney.setOnClickListener {
        val intent=Intent(this,SendMoney::class.java )
        startActivity(intent)
        }
        }

}