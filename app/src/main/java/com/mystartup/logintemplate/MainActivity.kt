package com.mystartup.logintemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/**
 * A Login Form Example in Kotlin Android
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to all views
        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button

        // clearing user_name and password edit text views on reset button click
        btn_reset.setOnClickListener{
            et_user_name.setText("")
            et_password.setText("")
        }

        // set onClickListener
        btn_submit.setOnClickListener{
            val user_name = et_user_name.text
            val password = et_password.text

            Toast.makeText(this, user_name, Toast.LENGTH_SHORT).show()

            // Your code to validade  the user_name and password combination
            // and verify the same
        }


    }
}
