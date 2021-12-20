package com.example.sstation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    TextView register;
    FloatingActionButton login;
    CheckBox checkedStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        checkedStatus = findViewById(R.id.checkbox);
        login = (FloatingActionButton)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tex_email = email.getText().toString();
                String tex_password = password.getText().toString();
                if (TextUtils.isEmpty(tex_email) || TextUtils.isEmpty(tex_password)){
                    Toast.makeText(com.example.sstation.MainActivity.this, "All Fields Required", Toast.LENGTH_SHORT).show();
                }
                if((tex_password.equals("azerty")) & (tex_email.equals("nader"))){
                    startActivity(new Intent(com.example.sstation.MainActivity.this,ProfileActivity.class)); }
                else {
                    Toast.makeText(com.example.sstation.MainActivity.this, "Wrong Password or Email please check", Toast.LENGTH_SHORT).show();}

            }
        });
        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.sstation.MainActivity.this,RegisterActivity.class));

            }
        });

    }
}