package com.chanse.code.butter_knife

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.OnTextChanged
import com.chanse.code.test.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    @BindView(R.id.username) lateinit var userName: EditText
    @BindView(R.id.password) lateinit var password: EditText

    @BindView(R.id.NO_DEBUG) lateinit var wrongView: TextView

    @OnTextChanged(R.id.username)
    fun onUserNameChanged() {

    }

    @OnTextChanged(R.id.password)
    fun onPasswordChanged() {

    }

    @OnClick(R.id.login)
    fun onLogin() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        ButterKnife.bind(this)

        username.setSelection(10)
        welcome_message.text = "Hello"
    }
}
