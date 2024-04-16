package com.example.loginregister;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        // Mendapatkan data dari Intent
        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        // Menampilkan data pada TextView yang sesuai
        TextView tvUsername = findViewById(R.id.tvUsername);
        TextView tvPassword = findViewById(R.id.tvPassword);

        tvUsername.setText(username);
        tvPassword.setText(password);
    }
}
