package com.example.moodycloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btngetStarted= findViewById<Button>(R.id.btn_getStarted)
        val btnsignUpGoogle= findViewById<Button>(R.id.btn_signUpGoogle)
        val btnsignUpAppleID= findViewById<Button>(R.id.btn_signUpAppleID)

        btngetStarted.setOnClickListener{
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }
        btnsignUpGoogle.setOnClickListener{
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }
        btnsignUpAppleID.setOnClickListener{
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }

    }
}