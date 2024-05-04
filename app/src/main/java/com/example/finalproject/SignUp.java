package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Button btnLogin2 = findViewById(R.id.btnLogin2);
        btnLogin2.setOnClickListener(v -> {
            Intent loginIntent = new Intent(SignUp.this, Login.class);
            startActivity(loginIntent);
        });
    }
}
