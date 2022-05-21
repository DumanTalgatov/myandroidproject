package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.userpassword);

        MaterialButton materialButton = findViewById(R.id.loginBTN);

        materialButton.setOnClickListener(view -> {
            if (username.getText().toString().equals("") && password.getText().toString().equals("")){
                Toast.makeText(LoginPage.this,"Please write your email and password",Toast.LENGTH_LONG).show();
            }else if (username.getText().toString().equals("arsensio@gmail.com") && password.getText().toString().equals("arsenick")){
                Toast.makeText(LoginPage.this,"BARI OKEY",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(LoginPage.this,Home_Page.class);
                startActivity(intent);
            }else if (!username.getText().toString().equals("arsensio@gmail.com") ){
                Toast.makeText(LoginPage.this,"This email is not registered. ",Toast.LENGTH_LONG).show();
            }else if (!username.getText().toString().equals("arsensio@gmail.com") || !password.getText().toString().equals("arsenick") ){
                Toast.makeText(LoginPage.this,"Incorrect Password or LOGIN  ",Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(LoginPage.this,"O debil ",Toast.LENGTH_LONG).show();
            }
        });


        MaterialButton register = findViewById(R.id.register);

        register.setOnClickListener(view -> {
            Intent intent = new Intent(LoginPage.this,RegisterPage.class);
            startActivity(intent);
        });
    }
}