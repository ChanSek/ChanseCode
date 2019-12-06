package com.chanse.code.view_binding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chanse.code.test.R
import com.chanse.code.test.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {

        }

        binding.username.setText("Something")
        binding.password.setText("Some Password")
    }
}
