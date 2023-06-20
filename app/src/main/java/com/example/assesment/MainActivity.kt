package com.example.assesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
//import com.example.assesment.databinding.ActivityLoginBinding
//import com.example.assesment.databinding.ActivityLoginBinding
import com.example.assesment.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }

    fun validateSignUp(){
        val lastName = binding.etLastName.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        var error = false


        if (lastName.isBlank()){
            binding.tilUserName.error = "username required"
            error = true
        }
        if (email.isBlank()){
            binding.tilEmail.error = "Email required"
            error = true
        }
        if (password.isBlank()){
            binding.tilPassword.error = "Password required"
            error = true
        }



        if (!error){
            Toast.makeText(this, "$email", Toast.LENGTH_LONG)
                .show()
        }
    }
}