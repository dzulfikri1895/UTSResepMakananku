package com.aplikasi.resepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button submit;
    EditText username, password;
    Boolean status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
        event();
    }

    private void event() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pwd = password.getText().toString();

                com.aplikasi.resepmakanan.LoginAction loginAction = new com.aplikasi.resepmakanan.LoginAction();

                status = loginAction.Login(uname, pwd);
                if (status){

                    Intent intent = new Intent(com.aplikasi.resepmakanan.LoginActivity.this, MainActivity.class);
                    intent.putExtra("username", uname);
                    intent.putExtra("password", pwd);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Username or password is incorrect", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void init() {
        submit = findViewById(R.id.btnSubmit);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }

}