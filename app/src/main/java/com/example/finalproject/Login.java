package com.example.finalproject;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
public class Login extends AppCompatActivity {
     @Override
     public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.login);

          Button btnSignUp2 = findViewById(R.id.btnSignUp2);
          btnSignUp2.setOnClickListener(v -> {
               Intent signUpIntent = new Intent(Login.this, SignUp.class);
               startActivity(signUpIntent);
          });
     }
}
