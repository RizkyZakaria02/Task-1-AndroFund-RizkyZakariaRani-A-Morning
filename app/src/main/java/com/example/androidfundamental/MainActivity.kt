package com.example.androidfundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var app:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        app=findViewById(R.id.textView2)

        val email =intent.getParcelableExtra<User>("User")?.username
        val password =intent.getParcelableExtra<User>("User")?.password
        app.text="Email: $email Password: $password"
    }
}