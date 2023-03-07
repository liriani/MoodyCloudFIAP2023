package com.example.moodycloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnsignInHome= findViewById<Button>(R.id.btn_signInHome)
        val btnsignUpHome= findViewById<Button>(R.id.btn_signUpHome)


        btnsignUpHome.setOnClickListener{
            val i = Intent(this, SignUpActivity::class.java)
            startActivity(i)
        }

        btnsignInHome.setOnClickListener{
            val i = Intent(this,SignInActivity::class.java)
            startActivity(i)
        }
    }

}
