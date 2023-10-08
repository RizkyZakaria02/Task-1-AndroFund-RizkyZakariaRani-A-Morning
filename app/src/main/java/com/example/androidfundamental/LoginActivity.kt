package com.example.androidfundamental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        this.etUsername = findViewById(R.id.edt_login_username)
        this.etPassword = findViewById(R.id.edt_login_password)

        val bundle = intent.extras
        if (bundle!=null){
            etUsername.setText(bundle.getString("username"))
            etPassword.setText(bundle.getString("password"))
        }

        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_login -> {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtra("username",User(etUsername.text.toString(),etPassword.text.toString()))
                startActivity(intent)
            }
        }

    }
}




