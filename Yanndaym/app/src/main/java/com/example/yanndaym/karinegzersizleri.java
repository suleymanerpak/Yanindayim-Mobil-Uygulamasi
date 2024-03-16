package com.example.yanndaym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class karinegzersizleri extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karinegzersizleri);

        button1 = findViewById(R.id.EllerHavadaYarimId);
        button2 = findViewById(R.id.AyakHavadaYarimId);
        button3 = findViewById(R.id.EllerHavadaTamId);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(karinegzersizleri.this,ellerhavadayarimmekik.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(karinegzersizleri.this,ayakhavadayarim.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(karinegzersizleri.this,ellerhavadatammekik.class);
                startActivity(intent);
            }
        });




    }
}