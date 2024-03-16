package com.example.yanndaym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class egzersizler extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egzersizler);

        button1 = findViewById(R.id.KolEgzersizleriId);
        button2 = findViewById(R.id.BacakEgzersizleriId);
        button3 = findViewById(R.id.KarinEgzersizleriId);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(egzersizler.this,kolegzersizleri.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(egzersizler.this,bacakegzersizleri.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(egzersizler.this,karinegzersizleri.class);
                startActivity(intent);
            }
        });





    }
}