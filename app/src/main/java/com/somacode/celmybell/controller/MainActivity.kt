package com.somacode.celmybell.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.somacode.celmybell.R
import com.somacode.celmybell.service.LoginService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEditText.setText("celmy@gmail.com")
        passwordEditText.setText("1234")

        loginButton.setOnClickListener {
            login(emailEditText.text.toString(), passwordEditText.text.toString())
        }

    }

    fun login(username: String, password: String) {
        LoginService.postLogin(this, username, password)
    }
}