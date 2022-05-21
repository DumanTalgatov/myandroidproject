package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);


        TextView username = findViewById(R.id.email);
        TextView password = findViewById(R.id.password);
        TextView repidPassword = findViewById(R.id.repidPassword);


        MaterialButton registration = findViewById(R.id.registration);

        registration.setOnClickListener(view -> {
            String pass = password.getText().toString();

            if (username.getText().toString().equals("")){
                Toast.makeText(RegisterPage.this,"Enter Email",Toast.LENGTH_LONG).show();
            }else if (password.getText().toString().equals("")){
                Toast.makeText(RegisterPage.this,"Enter Password",Toast.LENGTH_LONG).show();
            }else if (pass.length()<7){
                Toast.makeText(RegisterPage.this,"Password must contain at least 8 characters",Toast.LENGTH_LONG).show();
            }else if (!password.getText().toString().equals(repidPassword.getText().toString())){
                Toast.makeText(RegisterPage.this,"Password not same",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(RegisterPage.this,"Success Registration",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}