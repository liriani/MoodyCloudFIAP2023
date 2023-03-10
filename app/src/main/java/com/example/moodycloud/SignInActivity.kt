package com.example.moodycloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnsignIn= findViewById<Button>(R.id.btn_signIn)
        val btnsignInGoogle = findViewById<Button>(R.id.btn_signInGoogle)
        val btnsignInAppleID= findViewById<Button>(R.id.btn_signInAppleID)

        btnsignIn.setOnClickListener{
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }
        btnsignInGoogle.setOnClickListener{
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }
        btnsignInAppleID.setOnClickListener{
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }
    }
}