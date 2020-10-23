package com.integrator.giti.examoptativa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUser = findViewById<EditText>(R.id.etUser)
        val etPass = findViewById<EditText>(R.id.etPass)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val user = etUser.text.toString()
            val pass = etPass.text.toString()

            if(!user.isEmpty() && !pass.isEmpty()){
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("usuario", user)
                intent.putExtra("contraseña", pass)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Error en los datos", Toast.LENGTH_LONG).show()
            }

    }
    }
}