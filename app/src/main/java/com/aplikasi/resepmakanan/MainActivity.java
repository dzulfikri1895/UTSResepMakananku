package com.aplikasi.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        LinearLayout cdmakanan,cdminuman,cdjajajan;
        String uname, pwd;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            init();
            action();


            cdmakanan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Makanan.class);
                    startActivity(intent);
                }
            });
            cdminuman.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,Minuman.class);
                    startActivity(intent);
                }
            });
            cdjajajan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Jajanan.class);
                    startActivity(intent);
                }
            });
        }


        private void init() {
            cdmakanan = (LinearLayout) findViewById(R.id.btn_makanan);
            cdminuman = (LinearLayout) findViewById(R.id.btn_minuman);
            cdjajajan = (LinearLayout) findViewById(R.id.btn_jajanan);
        }

        private void action() {
            Intent intent = getIntent();
            uname = intent.getStringExtra("username");
            pwd = intent.getStringExtra("password");

            Toast.makeText(getApplicationContext(), "Welcome Back "+ uname, Toast.LENGTH_LONG).show();
        }
    }